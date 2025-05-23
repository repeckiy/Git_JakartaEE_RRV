package com.auction.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role = "User";

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Lot> ownedLots = new ArrayList<>();

    @ManyToMany
    @JoinTable(
        name = "user_bid_lots",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "lot_id")
    )
    private List<Lot> bidLots = new ArrayList<>();

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public User(String username, String email, String password, String role) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = (role != null) ? role : "User";
    }

    // Getters/Setters...

    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public List<Lot> getOwnedLots() { return ownedLots; }
    public List<Lot> getBidLots() { return bidLots; }
    public boolean isAdmin() { return "Administrator".equals(role); }

    public void setId(String id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
    public void setOwnedLots(List<Lot> ownedLots) { this.ownedLots = ownedLots; }
    public void setBidLots(List<Lot> bidLots) { this.bidLots = bidLots; }
}