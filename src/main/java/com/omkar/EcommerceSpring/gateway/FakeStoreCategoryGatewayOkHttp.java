package com.omkar.EcommerceSpring.gateway;

import com.google.gson.Gson;
import com.omkar.EcommerceSpring.dto.CategoryDTO;
import com.omkar.EcommerceSpring.dto.FakeStoreCategoryDTO;
import com.omkar.EcommerceSpring.gateway.api.OkHttpRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("fakeStoreCategoryGatewayOkHttp")
public class FakeStoreCategoryGatewayOkHttp implements ICategoryGateway {
    private final OkHttpRequest okHttpRequest;
    private final Gson gson;

    @Value("${URL}")
    private String url;

    public FakeStoreCategoryGatewayOkHttp(OkHttpRequest okHttpRequest, Gson gson) {
        this.okHttpRequest = okHttpRequest;
        this.gson = gson;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        String response = this.okHttpRequest.run(url);
        FakeStoreCategoryDTO fakeStoreCategoryDTO = this.gson.fromJson(response, FakeStoreCategoryDTO.class);

        if (fakeStoreCategoryDTO == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        return fakeStoreCategoryDTO.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();
    }
}
