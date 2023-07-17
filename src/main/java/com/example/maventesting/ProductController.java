package com.example.maventesting;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    // mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public List<Product> getProduct() {
        // finds all the products
        List<Product> products = productService.findAll();
        // returns the product list
        return products;
    }

    @GetMapping(value = "/product/id")
    public Product getProductbyID(@RequestParam(name = "id") String id) {
        // finds all the products
        Product products = productService.findById(id);
        // returns the product list
        return products;
    }
}