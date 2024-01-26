package com.vrx.spring.orm.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String categoryId;
    private String categoryTitle;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @ManyToMany
//    ## 2 extra Tables are created in @ManyToMany
    private List<Product> products = new ArrayList<>();

    public Category() {
    }

    public Category(String categoryId, String categoryTitle, List<Product> products) {
        this.categoryId = categoryId;
        this.categoryTitle = categoryTitle;
        this.products = products;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
