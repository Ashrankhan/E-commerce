package com.example.product_service.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class Categories extends Basemodel{
    private String name;
    private String description;
    private List<product> productList;
}
