package com.omkar.EcommerceSpring.controllers;

import com.omkar.EcommerceSpring.dto.ProductDTO;
import com.omkar.EcommerceSpring.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/category")
    public ResponseEntity<List<ProductDTO>> getProductsByCategory(@RequestParam("type") String categoryType) throws IOException {
        List<ProductDTO> products = productService.getProductsByCategory(categoryType);
        return ResponseEntity.ok(products);
    }
}
