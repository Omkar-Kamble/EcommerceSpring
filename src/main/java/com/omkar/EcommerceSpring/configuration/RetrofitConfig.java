package com.omkar.EcommerceSpring.configuration;

import com.omkar.EcommerceSpring.gateway.api.FakesStoreCategoryApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakesStoreCategoryApi fakesStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakesStoreCategoryApi.class);
    }
}
