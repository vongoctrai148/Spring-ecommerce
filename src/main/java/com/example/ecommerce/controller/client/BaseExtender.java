package com.example.ecommerce.controller.client;

import com.example.ecommerce.entity.Category;
import com.example.ecommerce.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

public class BaseExtender {
    @Autowired
    private CategoriesService categoriesService;

    @ModelAttribute("categories")
    public List<Category> getCategory(){
        return categoriesService.findCategory();
    }
}
