package com.omkar.EcommerceSpring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductResponseDTO {
    private String status;
    private String message;
    private List<ProductDTO> products;
}
