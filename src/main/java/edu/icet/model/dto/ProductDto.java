package edu.icet.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class ProductDto {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private int qty;
}
