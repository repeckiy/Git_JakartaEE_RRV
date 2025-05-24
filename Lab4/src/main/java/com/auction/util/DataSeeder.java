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

/**
 * Створює схему, очищає таблиці й сідає тестові дані.
 *
 * ▸ Якщо таблиць немає – createSchema() їх створить.
 * ▸ Якщо таблиці вже є – вони просто очищаються TRUNCATE-ом.
 */
@Singleton
@Startup
public class DataSeeder {

    @PersistenceContext(unitName = "auctionPU")
    private EntityManager em;

    @PostConstruct
    @Transactional
    public void seed() {
        /* 1. гарантуємо, що схему створено */
        createSchema();

        /* 2. очищаємо таблиці (якщо вони щойно створені – буде миттєво) */
        clearTables();

        /* 3. додаємо мінімальний набір тестових даних */
        insertSampleData();
    }

    /* ------------------------------------------------------------------ */

    /** CREATE TABLE … IF NOT EXISTS – безпечний при повторних запусках */
    private void createSchema() {

        // users ---------------------------------------------------------
        em.createNativeQuery("""
            CREATE TABLE IF NOT EXISTS users (
                id        VARCHAR(64)  PRIMARY KEY,
                username  VARCHAR(128) NOT NULL UNIQUE,
                email     VARCHAR(256) NOT NULL,
                password  VARCHAR(256) NOT NULL,
                role      VARCHAR(32)  NOT NULL
            )""").executeUpdate();

        // lots ----------------------------------------------------------
        em.createNativeQuery("""
            CREATE TABLE IF NOT EXISTS lots (
                id            VARCHAR(64)  PRIMARY KEY,
                title         VARCHAR(256) NOT NULL,
                description   TEXT,
                startprice    NUMERIC(12,2) NOT NULL,
                currentprice  NUMERIC(12,2) NOT NULL,
                owner_id      VARCHAR(64)  REFERENCES users(id),
                createdat     TIMESTAMP,
                startedat     TIMESTAMP,
                endedat       TIMESTAMP,
                active        BOOLEAN
            )""").executeUpdate();

        // bids ----------------------------------------------------------
        em.createNativeQuery("""
            CREATE TABLE IF NOT EXISTS bids (
                id         VARCHAR(64)  PRIMARY KEY,
                user_id    VARCHAR(64)  REFERENCES users(id),
                lot_id     VARCHAR(64)  REFERENCES lots(id),
                amount     NUMERIC(12,2) NOT NULL,
                createdat  TIMESTAMP
            )""").executeUpdate();

        // user_bid_lots -------------------------------------------------
        em.createNativeQuery("""
            CREATE TABLE IF NOT EXISTS user_bid_lots (
                user_id VARCHAR(64) REFERENCES users(id),
                lot_id  VARCHAR(64) REFERENCES lots(id),
                PRIMARY KEY (user_id, lot_id)
            )""").executeUpdate();
    }

    /** Очищення всіх таблиць одним TRUNCATE (швидко й без FK-помилок) */
    private void clearTables() {
        em.createNativeQuery("""
            TRUNCATE TABLE user_bid_lots,
                           bids,
                           lots,
                           users
            RESTART IDENTITY CASCADE
        """).executeUpdate();
    }

    /** Мінімальний тестовий набір */
    private void insertSampleData() {

        /* ––– admin ––– */
        User admin = new User();
        setId(admin, "ad33f267-8dd6-4711-8b82-222222222222");
        admin.setUsername("admin");
        admin.setEmail("adminovich@adm.com");
        admin.setPassword("Kiev_2025");
        admin.setRole("Administrator");
        em.persist(admin);

        /* ––– звичайний користувач ––– */
        User harry = new User();
        setId(harry, "fd372128-bc5f-4bf2-840a-2a89a04be0e5");
        harry.setUsername("Harry");
        harry.setEmail("harry@example.com");
        harry.setPassword("1");
        harry.setRole("User");
        em.persist(harry);

        /* ––– приклад лоту ––– */
        Lot lot = new Lot();
        setId(lot, "34863da1-9bb3-4c45-bd38-c3a8318d7cef");
        lot.setTitle("First test lot");
        lot.setDescription("This is a seeded lot created by DataSeeder.");
        lot.setStartPrice(new BigDecimal("123.00"));
        lot.setCurrentPrice(new BigDecimal("123.00"));
        lot.setCreatedAt(LocalDateTime.now());
        lot.setOwner(harry);       // власник – Harry
        lot.setActive(true);
        em.persist(lot);

        // двосторонній зв’язок
        harry.getOwnedLots().add(lot);
    }

    /* -------------------------------------------------------------- */
    /** Через рефлексію проставляємо статичний UUID (зручно для тестів) */
    private void setId(Object entity, String idValue) {
        try {
            var f = entity.getClass().getDeclaredField("id");
            f.setAccessible(true);
            f.set(entity, idValue);
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot set id via reflection", ex);
        }
    }
}
