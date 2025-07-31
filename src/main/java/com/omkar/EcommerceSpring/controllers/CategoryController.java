package com.omkar.EcommerceSpring.controllers;

import com.omkar.EcommerceSpring.dto.CategoryDTO;
import com.omkar.EcommerceSpring.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private ICategoryService categoryService;

    public CategoryController(ICategoryService _categoryService) {
        this.categoryService = _categoryService;
    }
    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }
}
