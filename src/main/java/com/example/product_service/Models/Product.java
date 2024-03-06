package com.example.product_service.Models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class product extends Basemodel {



    private String title;
    private double price;
    private String description;
    private Categories category;
    private String imageUrl;
}
