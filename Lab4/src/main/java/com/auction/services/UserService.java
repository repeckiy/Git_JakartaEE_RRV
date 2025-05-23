package com.auction.services;

import com.auction.model.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.util.List;

@Stateless
public class UserService {
    @PersistenceContext
    private EntityManager em;

    public User authenticate(String username, String password) {
        List<User> result = em.createQuery("SELECT u FROM User u WHERE u.username = :u AND u.password = :p", User.class)
                .setParameter("u", username)
                .setParameter("p", password)
                .getResultList();
        return result.isEmpty() ? null : result.get(0);
    }

    public List<User> getAllUsers() {
        return em.createQuery("SELECT u FROM User u ORDER BY u.username", User.class).getResultList();
    }

    public User getUser(String id) {
        return em.find(User.class, id);
    }

    public void setUserRole(String userId, String role) {
        User user = em.find(User.class, userId);
        if (user != null) {
            user.setRole(role);
            em.merge(user);
        }
    }

    public void updateUserPassword(String userId, String password) {
        User user = em.find(User.class, userId);
        if (user != null) {
            user.setPassword(password);
            em.merge(user);
        }
    }

    public void deleteUser(String userId) {
        User user = em.find(User.class, userId);
        if (user != null) {
            em.remove(user);
        }
    }

    public void addUser(User user) {
        em.persist(user);
    }

    public String getFirstUserId() {
        List<User> users = em.createQuery("SELECT u FROM User u", User.class).setMaxResults(1).getResultList();
        return users.isEmpty() ? null : users.get(0).getId();
    }
}