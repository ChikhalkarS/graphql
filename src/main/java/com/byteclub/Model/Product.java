package com.byteclub.Model;

import java.util.Arrays;
import java.util.List;

public record Product(Integer id, String name, String description, Double price,Integer categoryId) {

    public static List<Product> products = Arrays.asList(
            new Product(1, "MacBook Pro", "Apple MacBook Pro", 2000.0, 1),
            new Product(2, "iPhone 12", "Apple iPhone 12", 1000.0, 1),
            new Product(3, "Samsung Galaxy S21", "Samsung Galaxy S21", 800.0, 1),
            new Product(4, "Adidas T-shirt", "Adidas T-shirt", 50.0, 2),
            new Product(5, "Nike Shoes", "Nike Shoes", 100.0, 2),
            new Product(6, "Levi's Jeans", "Levi's Jeans", 80.0, 2),
            new Product(7, "Harry Potter", "Harry Potter book", 20.0, 3)

    );
}
