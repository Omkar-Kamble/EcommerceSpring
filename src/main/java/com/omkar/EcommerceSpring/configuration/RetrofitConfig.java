package com.omkar.EcommerceSpring.configuration;

import com.google.gson.Gson;
import com.omkar.EcommerceSpring.gateway.api.FakeStoreProductApi;
import com.omkar.EcommerceSpring.gateway.api.FakesStoreCategoryApi;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Value("${BASE_URL}")
    private String apiBaseUrl;

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(apiBaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakesStoreCategoryApi fakesStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakesStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreProductApi.class);
    }
}
