package com.omkar.EcommerceSpring.gateway.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class OkHttpRequest {
    private final OkHttpClient client;

    public OkHttpRequest(OkHttpClient client) {
        this.client = client;
    }

    public String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = this.client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
