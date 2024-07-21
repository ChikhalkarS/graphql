package com.byteclub.Model;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Category(Integer id, String name, String description) {
    public static List<Category> categories = Arrays.asList(
            new Category(1, "Electronics", "Electronic devices"),
            new Category(2, "Clothing", "Clothing items"),
            new Category(3, "Books", "Books and novels"),
            new Category(4, "Furniture", "Furniture items"),
            new Category(5, "Toys", "Toys and games")
    );


    public static Optional<Category> getCategoryById(Integer integer) {
       return categories.stream().filter(category -> category.id().equals(integer)).findFirst();
    }

    public static Optional<Category> getCategoryByName(String name) {
        return categories.stream().filter(category -> category.name().equals(name)).findFirst();
    }
}
