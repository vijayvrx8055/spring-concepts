package com.vrx.spring.orm.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;

    private String productTitle;

    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER)
//    @ManyToMany
    private List<Category> categories = new ArrayList<>();

    public Product() {
    }

    public Product(String productId, String productTitle, List<Category> categories) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.categories = categories;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
