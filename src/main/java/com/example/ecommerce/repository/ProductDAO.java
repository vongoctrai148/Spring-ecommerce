package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Long> {
    @Query("SELECT p from Product p,SubCategory s where p.subcategory.id = s.id and s.slug = ?1")
    List<Product> findProductBySlug(String slug);
}
