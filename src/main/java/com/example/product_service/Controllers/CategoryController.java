package com.example.product_service.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    @GetMapping()
    public String getAllCategories() {
        return "Getting all categories";
    }
    @GetMapping("/{categoryId}")
    public String getProductsInCategory(@PathVariable("categoryId") Long categoryId){
        return "Get products in category";
    }
}
