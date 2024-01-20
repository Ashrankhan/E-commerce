package com.example.product_service.Dtos;

import com.example.product_service.Models.Categories;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Productdto {
    private String title;
    private double price;
    private String description;
    private Categories category;
    private String imageUrl;
}
