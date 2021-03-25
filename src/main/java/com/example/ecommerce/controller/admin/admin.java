package com.example.ecommerce.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class admin {
    @GetMapping("admin/index")
    public String getHomepage(){
        return "admin/index";
    }
}
