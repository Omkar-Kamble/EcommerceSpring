package com.omkar.EcommerceSpring.gateway;

import com.omkar.EcommerceSpring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface IProductGateway {
    List<ProductDTO> getProductsByCategory(String category) throws IOException;
}
