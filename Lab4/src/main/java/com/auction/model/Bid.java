package com.auction.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;

/**
 * Entity that represents a single bid in the system.
 *
 *  • `@ManyToOne`  – bid is ALWAYS linked to a user and a lot  
 *  • `createdAt`   – stored in DB as `TIMESTAMP`, converted to {@link Date}
 *                    for use from JSP via the convenience getter below
 */
@Entity
@Table(name = "bids")
public class Bid {

    /* ---------- persistent fields ---------- */
    @Id
    private String id;

    @ManyToOne @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne @JoinColumn(name = "lot_id",  nullable = false)
    private Lot  lot;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal amount;

    private LocalDateTime createdAt;

    /* ---------- ctors ---------- */
    public Bid() {
        this.id        = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
    }
    public Bid(User user, Lot lot, BigDecimal amount) {
        this();
        this.user   = user;
        this.lot    = lot;
        this.amount = amount;
    }

    /* ---------- getters ---------- */
    public String        getId()        { return id; }
    public User          getUser()      { return user; }
    public Lot           getLot()       { return lot; }
    public BigDecimal    getAmount()    { return amount; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    /** ✨ Helper for JSTL – lets us write `${bid.createdAtDate}` in JSP */
    public Date getCreatedAtDate() {
        return (createdAt == null) ? null
               : Date.from(createdAt.atZone(ZoneId.systemDefault()).toInstant());
    }

    /* ---------- setters (needed by JPA) ---------- */
    public void setId(String id)                { this.id = id; }
    public void setUser(User user)              { this.user = user; }
    public void setLot(Lot lot)                 { this.lot = lot; }
    public void setAmount(BigDecimal amount)    { this.amount = amount; }
    public void setCreatedAt(LocalDateTime ts)  { this.createdAt = ts; }
}