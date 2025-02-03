package com.ViktorVranar.online_bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double totalPrice;

    @OneToMany
    private List<Book> books;

    @ManyToOne
    private Customer customer;

    //TODO
    public double calculateTotalPrice() {
        double price = 0;

        return price;
    }
}