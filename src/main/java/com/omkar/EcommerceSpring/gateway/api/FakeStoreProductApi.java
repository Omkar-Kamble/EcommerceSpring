package com.omkar.EcommerceSpring.gateway.api;

import com.omkar.EcommerceSpring.dto.FakeStoreProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.io.IOException;

public interface FakeStoreProductApi {
    @GET("products/category")
    Call<FakeStoreProductResponseDTO> getProductsByCategory(@Query("type") String categoryType) throws IOException;
}
