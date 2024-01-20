package com.example.product_service.Service;

public interface Product_Service_Interface {
    String getsingleproduct(Long productid);

    String getallproducts();

    String addproduct();

    String updateproduct();

    String deleteproduct();
}
