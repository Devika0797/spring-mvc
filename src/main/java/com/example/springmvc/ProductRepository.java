package com.example.springmvc;

import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products = new ArrayList<>();


    public void init(){
        products.addAll(Arrays.asList(
                new Product(1, "Яблоко",50),
                new Product(2, "Молоко", 70),
                new Product(3, "Яйца", 90),
                new Product(4, "Хлеб", 30),
                new Product(5, "Масло", 180)
        ));
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public void save(Product product){
        products.add(product);
    }


    public  Product findById(int id) {
        Product product = new Product();
        return product;
    }
}
