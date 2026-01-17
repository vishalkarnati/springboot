package com.cart.shopping.service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.cart.shopping.model.Product;

@Component
public class ProductService {
    Map<Integer, Product> products = new HashMap<>();
    
    public ProductService() {
        products.put(1, new Product(1, "Bottle", 300));
        products.put(2, new Product(2, "Book", 50));
        products.put(3, new Product(3, "Pen", 10));
    }
    
    // Get all the Products
    public List<Product> getProducts(){
        return new ArrayList<>(products.values());
    }

    // Get Product by Id
    public Product getProductById(int id){
        return products.get(id);
    }

    // Add new Product
    public void addProduct(Product product){
        products.put(product.getId(), product);
    }

    // Update Product details
    public void updateProduct(Product product){
        int id = product.getId();
        if (products.containsKey(id)) {
            products.put(id, product);
        }
    }

    // Delete the product
    public void deleteProduct(Product product){
        int id = product.getId();
        products.remove(id);
    }
    
}
