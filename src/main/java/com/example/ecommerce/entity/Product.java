package com.example.ecommerce.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private SubCategory subcategory;
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    List<ProductDetail> productDetails;

    public Product() {
    }

    public Product(Long id_product, String product_name, String description, SubCategory subCategory) {
        this.id = id_product;
        this.name = product_name;
        this.description = description;
        this.subcategory = subCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id_product) {
        this.id = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String product_name) {
        this.name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubCategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(SubCategory subcategory) {
        this.subcategory = subcategory;
    }
}
