package com.example.ecommerce.services;

import com.example.ecommerce.entity.Category;
import com.example.ecommerce.repository.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;
import java.util.List;

@Service
public class CategoriesService {
    @Autowired
    private CategoryDAO categoryDAO;

    @Transactional
    public List<Category> findCategory(){
        return categoryDAO.findAll();
    }
    @Transactional
    public void addCategory(){
        categoryDAO.save(new Category());
    }
}
