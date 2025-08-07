package com.omkar.EcommerceSpring.dto;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class FakeStoreProductDTO {
    private String status;
    private String message;
    @SerializedName("product")
    private ProductDTO product;
    private List<ProductDTO> products;
}
