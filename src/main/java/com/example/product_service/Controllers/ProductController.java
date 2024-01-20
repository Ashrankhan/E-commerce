package com.example.product_service.Controllers;


import com.example.product_service.Dtos.Productdto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("")
    public String getsingleProduct() {
        return "Getting single product";
    }
    @GetMapping("/{productID}")
    public String getProduct(@PathVariable("productID") Long productID) {
        return "Getting single product"+productID;
    }

    @PostMapping("")
    public String createProduct(@RequestBody Productdto productdto) {
        return "Creating product"+productdto;
    }

    @PutMapping("/{productID}")
    public String updateProduct(@PathVariable("productID") Long productID) {
        return "Updating product";
    }
    @DeleteMapping("/{productID}")
    public String deleteProduct(@PathVariable("productID") Long productID) {
        return "Deleting product"+productID;
    }

}
