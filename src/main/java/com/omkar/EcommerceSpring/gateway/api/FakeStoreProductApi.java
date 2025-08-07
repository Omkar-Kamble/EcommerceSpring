package com.omkar.EcommerceSpring.gateway.api;

import com.omkar.EcommerceSpring.dto.FakeStoreProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.io.IOException;

public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<FakeStoreProductDTO> getProductById(@Path("id") Long id) throws IOException;
    @GET("products")
    Call<FakeStoreProductDTO> getAllFakeProducts() throws IOException;
    @GET("products/category")
    Call<FakeStoreProductDTO> getProductsByCategory(@Query("type") String categoryType) throws IOException;
}
