package com.omkar.EcommerceSpring.dto;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private int id;
    private String title;
    private String image;
    private double price;
    private String description;
    private String category;
    private String brand;
    private String model;
    private String color;
    private int discount;
}
