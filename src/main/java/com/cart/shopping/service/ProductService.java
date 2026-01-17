package com.cart.shopping.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cart.shopping.model.Product;

@Component
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(1, "Bottle", 300),
        new Product(2, "Book", 50),
        new Product(3, "Pen", 10)
    ));
    
    // Get all the Products
    public List<Product> getProducts(){
        return products;
    }

    // Get Product by Id
    public Product getProductById(int id){
        for(Product product : products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    // Add new Product
    public void addProduct(Product product){
        products.add(product);
    }

    // Update Product details
    public void updateProduct(Product product){
        int id = product.getId();
        String name = product.getName();
        int price = product.getPrice();

        for(Product p : products){
            if (p.getId() == id){
                p.setName(name);
                p.setPrice(price);
            }
        }
    }

    public void deleteProduct(Product product){
        int id = product.getId();
        
        for(Product p : products){
            if (p.getId() == id){
                products.remove(p);
                break;
            }
        }
    }
    
}
