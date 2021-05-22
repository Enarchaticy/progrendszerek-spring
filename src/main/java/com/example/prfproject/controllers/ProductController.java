package com.example.prfproject.controllers;

import java.util.List;

import com.example.prfproject.models.product.Product;
import com.example.prfproject.models.product.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello world!";
    }

    @PostMapping(path="/product", consumes = "application/json")
    public String newProduct(@RequestBody Product product) {
        try {
            this.productService.addProduct(product);
            return "Success";
        } catch (Exception e) {
            return "Error, check server errors";
        }
    }
    
    @GetMapping(path="/products")
    public List<Product> getAllProducts() {
        try {
            List<Product> products = this.productService.getAllProducts();
            return products;
        } catch (Exception e) {
            return null;
        }
    }
    
    @GetMapping(path="/product")
    public Product getProductsById(@RequestParam int id) {
        try {
            Product product = this.productService.getProductById(id);
            return product;
        } catch (Exception e) {
            return null;
        }
    }
}
