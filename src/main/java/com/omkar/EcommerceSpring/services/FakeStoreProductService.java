package com.omkar.EcommerceSpring.services;

import com.omkar.EcommerceSpring.dto.ProductDTO;
import com.omkar.EcommerceSpring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        return this.productGateway.getProductById(id);
    }

    @Override
    public List<ProductDTO> getAllProducts() throws IOException {
        return this.productGateway.getAllProducts();
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String category) throws IOException {
        return this.productGateway.getProductsByCategory(category);
    }
}
