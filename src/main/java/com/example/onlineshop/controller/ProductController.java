package com.example.onlineshop.controller;

import com.example.onlineshop.model.entity.Product;
import com.example.onlineshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin(maxAge = 3600)


public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;

    }
    @GetMapping("/api/products")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
    @PostMapping("/api/product")
    public Product addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    @PostMapping("/api/products")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.createProducts(products);
    }

    @GetMapping("/api/product/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @PutMapping("/api/product")

    public Product editProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }
    @DeleteMapping("/api/product/{id}")
    public String deleteProduct(@PathVariable Long id){
        return productService.deleteProductById(id);
    }

}
