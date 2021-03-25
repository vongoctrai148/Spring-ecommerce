package com.example.ecommerce.services;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private ProductDAO productDAO;

    @Transactional
    public List<Product> findProductBySlug(String slug){
        return productDAO.findProductBySlug(slug);
    }
}
