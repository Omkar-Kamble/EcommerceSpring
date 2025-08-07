package com.omkar.EcommerceSpring.services;

import com.omkar.EcommerceSpring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    ProductDTO getProductById(Long id) throws IOException;
    List<ProductDTO> getAllProducts() throws IOException;
    List<ProductDTO> getProductsByCategory(String category) throws IOException;
}
