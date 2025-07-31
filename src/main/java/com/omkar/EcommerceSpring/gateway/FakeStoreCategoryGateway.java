package com.omkar.EcommerceSpring.gateway;

import com.omkar.EcommerceSpring.dto.CategoryDTO;
import com.omkar.EcommerceSpring.dto.FakeStoreCategoryResponseDTO;
import com.omkar.EcommerceSpring.gateway.api.FakesStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakesStoreCategoryApi fakesStoreCategoryApi;

    public FakeStoreCategoryGateway(FakesStoreCategoryApi fakesStoreCategoryApi) {
        this.fakesStoreCategoryApi = fakesStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO response = this.fakesStoreCategoryApi.getAllFakeCategories().execute().body();
        if(response == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        return response.getCategories().stream()
                        .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                        .toList();
    }
}
