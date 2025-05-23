package com.auction.services;

import com.auction.model.Bid;
import com.auction.model.Lot;
import com.auction.model.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Stateless
public class BidService {
    @PersistenceContext
    private EntityManager em;

    public boolean placeBid(String userId, String lotId, BigDecimal amount) {
        Lot lot = em.find(Lot.class, lotId);
        User user = em.find(User.class, userId);
        if (lot == null || user == null || !lot.isActive() || lot.getOwner().getId().equals(userId)
                || (lot.getEndedAt() != null) || amount.compareTo(lot.getCurrentPrice()) <= 0) {
            return false;
        }
        Bid bid = new Bid(user, lot, amount);
        em.persist(bid);

        lot.getBids().add(bid);
        lot.setCurrentPrice(amount);
        em.merge(lot);

        if (!user.getBidLots().contains(lot)) {
            user.getBidLots().add(lot);
            em.merge(user);
        }
        return true;
    }

    public BigDecimal getMinimumBidAmount(String lotId) {
        Lot lot = em.find(Lot.class, lotId);
        return (lot != null) ? lot.getCurrentPrice().add(BigDecimal.ONE) : BigDecimal.ZERO;
    }

    public Bid getHighestBid(String lotId) {
        List<Bid> bids = em.createQuery(
            "SELECT b FROM Bid b WHERE b.lot.id = :lotId ORDER BY b.amount DESC", Bid.class)
            .setParameter("lotId", lotId)
            .setMaxResults(1)
            .getResultList();
        return bids.isEmpty() ? null : bids.get(0);
    }

    public boolean canUserBid(String userId, String lotId) {
        Lot lot = em.find(Lot.class, lotId);
        return lot != null && !lot.getOwner().getId().equals(userId) && lot.isActive();
    }
}