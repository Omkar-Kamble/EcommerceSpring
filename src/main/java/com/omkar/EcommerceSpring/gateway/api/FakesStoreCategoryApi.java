package com.omkar.EcommerceSpring.gateway.api;

import com.omkar.EcommerceSpring.dto.FakeStoreCategoryDTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakesStoreCategoryApi {
    @GET("products/category")
    Call<FakeStoreCategoryDTO> getAllFakeCategories();
}
