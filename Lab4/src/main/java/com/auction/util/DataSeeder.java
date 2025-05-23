package com.auction.util;

import com.auction.model.Lot;
import com.auction.model.User;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Singleton
@Startup
public class DataSeeder {
    @PersistenceContext(unitName = "auctionPU")
    private EntityManager em;

    @PostConstruct
    @Transactional
    public void seed() {
        // Очищаємо таблиці у правильному порядку (щоб не порушити зовнішні ключі)
        em.createNativeQuery("DELETE FROM user_bid_lots").executeUpdate();
        em.createNativeQuery("DELETE FROM bids").executeUpdate();
        em.createNativeQuery("DELETE FROM lots").executeUpdate();
        em.createNativeQuery("DELETE FROM users").executeUpdate();

        // Створюємо тестових користувачів
        User admin = new User();
        setId(admin, "ad33f267-8dd6-4711-8b82-222222222222");
        admin.setUsername("admin");
        admin.setEmail("adminovich@adm.com");
        admin.setPassword("Kiev_2025");
        admin.setRole("Administrator");
        em.persist(admin);
//
//        User user = new User();
//        setId(user, "ed76a098-fb1c-43ce-83b8-111111111111");
//        user.setUsername("rrv");
//        user.setEmail("rrv@example.com");
//        user.setPassword("Kiev_2025");
//        user.setRole("User");
//        em.persist(user);
//
//        // Створюємо тестові лоти
//        Lot lot1 = new Lot();
//        setId(lot1, "e0a1fd71-7e2d-42f7-b337-555555555555");
//        lot1.setTitle("123");
//        lot1.setDescription("122");
//        lot1.setStartPrice(new BigDecimal("2000.00"));
//        lot1.setCurrentPrice(new BigDecimal("2000.00"));
//        lot1.setCreatedAt(LocalDateTime.now());
//        lot1.setOwner(admin);
//        em.persist(lot1);
//
//        Lot lot2 = new Lot();
//        setId(lot2, "f4e1cdb6-79d2-4d54-b0f6-666666666666");
//        lot2.setTitle("wer");
//        lot2.setDescription("qwre");
//        lot2.setStartPrice(new BigDecimal("1110.00"));
//        lot2.setCurrentPrice(new BigDecimal("1110.00"));
//        lot2.setCreatedAt(LocalDateTime.now());
//        lot2.setOwner(admin);
//        em.persist(lot2);
//
//        Lot lot3 = new Lot();
//        setId(lot3, "97f6e85d-9a8b-4b68-b6e1-777777777777");
//        lot3.setTitle("knopa");
//        lot3.setDescription("popa");
//        lot3.setStartPrice(new BigDecimal("100.00"));
//        lot3.setCurrentPrice(new BigDecimal("100.00"));
//        lot3.setCreatedAt(LocalDateTime.now());
//        lot3.setOwner(user);
//        em.persist(lot3);
//
//        // Аналогічно можна додати bids та інші дані
    }

    // Метод для встановлення id через рефлексію
    private void setId(Object obj, String idValue) {
        try {
            var field = obj.getClass().getDeclaredField("id");
            field.setAccessible(true);
            field.set(obj, idValue);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Cannot set field 'id' on object", e);
        }
    }
}