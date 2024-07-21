package com.byteclub.controller;

import com.byteclub.Model.Category;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {

    @QueryMapping
    public List<Category> categories() {
        return Category.categories;
    }

    @QueryMapping
    public Optional<Category> categoryById(@Argument Integer id) {
        return Category.categories.stream()
                .filter(category -> category.id().equals(id))
                .findFirst();
    }

    @QueryMapping
    public Category categoryByName(@Argument String name) {
        return Category.categories.stream().
                filter(category -> category.name().equals(name))
                .findFirst().orElse(null);
    }

}
