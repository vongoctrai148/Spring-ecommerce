package com.example.ecommerce.controller.client;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.services.CategoriesService;
import com.example.ecommerce.services.ProductServices;
import com.example.ecommerce.services.SubCategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HomepageController extends BaseExtender{
    @Autowired
    private CategoriesService categoriesService;
    @Autowired
    private SubCategoryServices subCategoryServices;
    @Autowired
    private ProductServices productServices;

    @GetMapping("/")
    public String getHomepage(){
        return "homepage";
    }

    @GetMapping("subCategory/{categorySlug}")
    public String getListProduct(@PathVariable("categorySlug") String slug, Model model){
        if(slug == null){
            return "404Page";
        }
        List<Product> products = productServices.findProductBySlug(slug);
        model.addAttribute("products",products);
        return "listProduct";
    }
    @GetMapping("/product-detail/{productId}")
    public String getProductDetail(@PathVariable("productId") Long productId, Model model){
            return "productDetail";
    }
}
