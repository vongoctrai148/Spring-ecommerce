package com.example.ecommerce.services;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.SubCategory;
import com.example.ecommerce.repository.SubCategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubCategoryServices {
    @Autowired
    private SubCategoryDAO subCategoryDAO;
    @Transactional
    public SubCategory findSubCategoryBycategoryId(Long id){
        return subCategoryDAO.findSubCategoryByCategoryId(id);
    }

    @Transactional
    public List<SubCategory> findSubCategory(){
        return subCategoryDAO.findAll();
    }
    @Transactional
    public Long findSubIdBySubSlug(String slug){
        return subCategoryDAO.findSubIdBySubSlug(slug);
    }
}
