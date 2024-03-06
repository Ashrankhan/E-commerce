package com.example.product_service.Client.fakestore.dto;

import com.example.product_service.Dtos.RatingDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

public class Fakestoredto implements IClientProductDto {
    private Long id;
    private String title;
    private double price;
    private String description;
    private String  category;
    private String image;
    private RatingDTO rating;
}

