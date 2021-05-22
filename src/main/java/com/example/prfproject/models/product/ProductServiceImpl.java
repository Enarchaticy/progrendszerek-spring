package com.example.prfproject.models.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = this.productRepository.findAll();
        return products;
    }

    @Override
    public Product getProductById(int id) {
        Product product = this.productRepository.findById(id).get();
        return product;
    }

}
