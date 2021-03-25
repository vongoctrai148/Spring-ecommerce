package com.example.ecommerce.repository;

import com.example.ecommerce.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SubCategoryDAO extends JpaRepository<SubCategory, Long> {

    @Query("SELECT c from SubCategory c where  c.category.id = ?1")
    SubCategory findSubCategoryByCategoryId(Long category_id);

    @Query("select c.id from SubCategory c where c.slug = ?1")
    Long findSubIdBySubSlug(String slug);
}
