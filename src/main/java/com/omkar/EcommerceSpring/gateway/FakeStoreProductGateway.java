package com.omkar.EcommerceSpring.gateway;

import com.omkar.EcommerceSpring.dto.FakeStoreProductResponseDTO;
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
    public List<ProductDTO> getProductsByCategory(String category) throws IOException {
        FakeStoreProductResponseDTO response = this.fakeStoreProductApi.getProductsByCategory(category).execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch products from FakeStore API");
        }
        return response.getProducts();
    }
}
