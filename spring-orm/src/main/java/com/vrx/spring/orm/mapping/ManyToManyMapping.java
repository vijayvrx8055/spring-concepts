package com.vrx.spring.orm.mapping;

import com.vrx.spring.orm.entity.Category;
import com.vrx.spring.orm.entity.Product;
import com.vrx.spring.orm.repository.CategoryRepository;
import com.vrx.spring.orm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ManyToManyMapping {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public void saveProduct() {
        Product product1 = new Product();
        product1.setProductId(getId());
        product1.setProductTitle("LG Android tv");
        Product product2 = new Product();
        product2.setProductId(getId());
        product2.setProductTitle("Realme 10");
        Product product3 = new Product();
        product3.setProductId(getId());
        product3.setProductTitle("Realme SmartWatch");
        Category category1 = new Category();
        category1.setCategoryId(getId());
        category1.setCategoryTitle("Electronics");
        Category category2 = new Category();
        category2.setCategoryId(getId());
        category2.setCategoryTitle("Mobile");
        Category category3 = new Category();
        category3.setCategoryId(getId());
        category3.setCategoryTitle("Watch");

        List<Product> category1Products = category1.getProducts();
        category1Products.add(product1);
        category1Products.add(product2);
        category1Products.add(product3);

        List<Product> category2Products = category2.getProducts();
        category2Products.add(product2);

        List<Product> category3Products = category3.getProducts();
        category3Products.add(product3);

        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);

    }

    public String getId() {
        return String.valueOf(UUID.randomUUID());
    }
}
