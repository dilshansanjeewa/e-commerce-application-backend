package edu.icet.model.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Product {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private int qty;
}
