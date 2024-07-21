package com.byteclub.controller;

import com.byteclub.Model.Category;
import com.byteclub.Model.Product;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    @QueryMapping
    public List<Product> products() {
        return Product.products;
    }

    @QueryMapping
    public Optional<Product> productById(@Argument Integer id) {
        return Product.products.stream()
                .filter(product -> product.id().equals(id))
                .findFirst();
    }

    @QueryMapping
    public List<Product> productsByCategory(@Argument Integer id) {
        return Product.products.stream()
                .filter(product -> product.categoryId().equals(id))
                .toList();
    }


    @QueryMapping
    public List<Product> productByCategoryName(@Argument String name) {
        return Product.products.stream()
                .filter(product -> Category.categories.stream()
                        .filter(category -> category.name().equals(name))
                        .map(Category::id)
                        .findFirst()
                        .orElse(-1)
                        .equals(product.categoryId()))
                .toList();
    }


    @SchemaMapping
    public Optional<Category> category(Product product)
    {
        return Category.getCategoryById(product.categoryId());
    }

    @SchemaMapping
    public Optional<Category> categoryByName(Product product,@Argument String name)
    {
        return Category.getCategoryByName(name);
    }

}
