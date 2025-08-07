package com.omkar.EcommerceSpring.gateway;

import com.omkar.EcommerceSpring.dto.FakeStoreProductDTO;
import com.omkar.EcommerceSpring.dto.ProductDTO;
import com.omkar.EcommerceSpring.gateway.api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway {

    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        FakeStoreProductDTO response = this.fakeStoreProductApi.getProductById(id).execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch products from FakeStore API");
        }
        return response.getProduct();
    }

    @Override
    public List<ProductDTO> getAllProducts() throws IOException {
        FakeStoreProductDTO response = this.fakeStoreProductApi.getAllFakeProducts().execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch products from FakeStore API");
        }
        return response.getProducts();
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String category) throws IOException {
        FakeStoreProductDTO response = this.fakeStoreProductApi.getProductsByCategory(category).execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch products from FakeStore API");
        }
        return response.getProducts();
    }
}
