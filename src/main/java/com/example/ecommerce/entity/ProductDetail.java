package com.example.ecommerce.entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Table(name = "productdetails")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String size;
    private String color;
    private int quantity;
    private float price;
    private String image;
    private float sale;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    public ProductDetail() {
    }

    public ProductDetail(Long id, String size, String color, int quantity, float price, String image, float sale, Product product) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
        this.sale = sale;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

