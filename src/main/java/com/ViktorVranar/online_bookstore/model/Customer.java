package com.ViktorVranar.online_bookstore.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int loyaltyPoints;

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }

    public boolean canRedeemLoyaltyPoints() {
        return this.loyaltyPoints >= 10;
    }

    public void redeemLoyaltyPoints() {
        this.loyaltyPoints = 0;
    }
}