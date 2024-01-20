package com.example.product_service.Service;

public class Product_Service implements Product_Service_Interface {

    @Override
    public String getsingleproduct(Long productid) {
        return "single product";
    }
    @Override
    public String getallproducts() {
        return "all products";
    }
    @Override
    public String addproduct() {
        return "add product";
    }
    @Override
    public String updateproduct() {
        return "update product";
    }
    @Override
    public String deleteproduct() {
        return "delete product";
    }

}
