package com.cart.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cart.shopping.model.Product;
import com.cart.shopping.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService products;

    @GetMapping("/products")
    public List<Product> greet(){
        return products.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return products.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        products.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        products.updateProduct(product);
    }

    @DeleteMapping("/products")
    public void deleteProduct(@RequestBody Product product){
        products.deleteProduct(product);
    }
}
