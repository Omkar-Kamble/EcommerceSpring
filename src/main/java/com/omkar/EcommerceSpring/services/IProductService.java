package com.omkar.EcommerceSpring.services;

import com.omkar.EcommerceSpring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductService {
    List<ProductDTO> getProductsByCategory(String category) throws IOException;
}
