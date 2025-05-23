package com.auction.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Table(name = "lots")
public class Lot {
    @Id
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal startPrice;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal currentPrice;

    private LocalDateTime createdAt;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @OneToMany(mappedBy = "lot", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("createdAt ASC")
    private List<Bid> bids = new ArrayList<>();

    public Lot() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.active = false;
    }

    public Lot(String title, String description, BigDecimal startPrice, User owner) {
        this();
        this.title = title;
        this.description = description;
        this.startPrice = startPrice;
        this.currentPrice = startPrice;
        this.owner = owner;
    }

    // Getters/Setters...

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public BigDecimal getStartPrice() { return startPrice; }
    public BigDecimal getCurrentPrice() { return currentPrice; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getStartedAt() { return startedAt; }
    public LocalDateTime getEndedAt() { return endedAt; }
    public User getOwner() { return owner; }
    public boolean isActive() { return active; }
    public List<Bid> getBids() { return bids; }
    public Date getCreatedAtDate() {
        if (createdAt == null) return null;
        return Date.from(createdAt.atZone(ZoneId.systemDefault()).toInstant());
    }
    public Date getStartedAtDate() {
        if (startedAt == null) return null;
        return Date.from(startedAt.atZone(ZoneId.systemDefault()).toInstant());
    }
    public Date getEndedAtDate() {
        if (endedAt == null) return null;
        return Date.from(endedAt.atZone(ZoneId.systemDefault()).toInstant());
    }

    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setStartPrice(BigDecimal startPrice) { this.startPrice = startPrice; }
    public void setCurrentPrice(BigDecimal currentPrice) { this.currentPrice = currentPrice; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public void setStartedAt(LocalDateTime startedAt) { this.startedAt = startedAt; }
    public void setEndedAt(LocalDateTime endedAt) { this.endedAt = endedAt; }
    public void setOwner(User owner) { this.owner = owner; }
    public void setActive(boolean active) { this.active = active; }
    public void setBids(List<Bid> bids) { this.bids = bids; }
}