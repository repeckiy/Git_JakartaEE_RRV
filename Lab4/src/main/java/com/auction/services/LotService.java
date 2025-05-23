package com.auction.services;

import com.auction.model.Lot;
import com.auction.model.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Stateless
public class LotService {
    @PersistenceContext
    private EntityManager em;   

    public Lot getLot(String id) {
        return em.find(Lot.class, id);
    }

    public List<Lot> getAllLots() {
        return em.createQuery("SELECT l FROM Lot l ORDER BY l.createdAt DESC", Lot.class)
                .getResultList();
    }

    public List<Lot> getActiveLots() {
        return em.createQuery("SELECT l FROM Lot l WHERE l.active = true AND l.endedAt IS NULL ORDER BY l.createdAt DESC", Lot.class)
                .getResultList();
    }

    public List<Lot> getUserLots(String userId) {
        return em.createQuery("SELECT l FROM Lot l WHERE l.owner.id = :uid ORDER BY l.createdAt DESC", Lot.class)
                .setParameter("uid", userId)
                .getResultList();
    }

    public Lot createLot(String title, String description, BigDecimal startPrice, String userId) {
        User owner = em.find(User.class, userId);
        if (owner == null) throw new IllegalArgumentException("User not found");
        Lot lot = new Lot(title, description, startPrice, owner);
        em.persist(lot);
        owner.getOwnedLots().add(lot);
        em.merge(owner);
        return lot;
    }

    // =================== Операції з лотом ===================

public void deleteLot(String lotId, String executorId) {
    Lot lot = em.find(Lot.class, lotId);
    User executor = em.find(User.class, executorId);
    if (lot == null || executor == null) return;

    if (isAdmin(executor) || isOwner(executor, lot)) {
        // Видаляємо всі ставки цього лоту
        em.createQuery("DELETE FROM Bid b WHERE b.lot.id = :lotId")
          .setParameter("lotId", lotId)
          .executeUpdate();
        em.createNativeQuery("DELETE FROM user_bid_lots WHERE lot_id = ?1")
          .setParameter(1, lotId)
          .executeUpdate();

        // Тепер можна безпечно видалити сам лот
        em.remove(lot);
    } else {
        throw new SecurityException("Access denied");
    }
}

    public void startAuction(String lotId, String executorId) {
        Lot lot = em.find(Lot.class, lotId);
        User executor = em.find(User.class, executorId);
        if (lot == null || executor == null) return;
        if (!lot.isActive() && (isAdmin(executor) || isOwner(executor, lot))) {
            lot.setActive(true);
            lot.setStartedAt(java.time.LocalDateTime.now());
            em.merge(lot);
        } else {
            throw new SecurityException("Access denied or already started");
        }
    }

    public void stopAuction(String lotId, String executorId) {
        Lot lot = em.find(Lot.class, lotId);
        User executor = em.find(User.class, executorId);
        if (lot == null || executor == null) return;
        if (lot.isActive() && (isAdmin(executor) || isOwner(executor, lot))) {
            lot.setActive(false);
            lot.setEndedAt(java.time.LocalDateTime.now());
            em.merge(lot);
        } else {
            throw new SecurityException("Access denied or already stopped");
        }
    }

    // =============== Пошук ===============
    public List<Lot> searchLotsByKeyword(String keyword) {
        return em.createQuery(
                "SELECT l FROM Lot l WHERE LOWER(l.title) LIKE :kw OR LOWER(l.description) LIKE :kw ORDER BY l.createdAt DESC", Lot.class)
                .setParameter("kw", "%" + keyword.toLowerCase() + "%")
                .getResultList();
    }

    // =============== Перевірки ===============
    private boolean isAdmin(User user) {
        return user != null && "Administrator".equals(user.getRole());
    }

    private boolean isOwner(User user, Lot lot) {
        return user != null && lot.getOwner().getId().equals(user.getId());
    }

}
