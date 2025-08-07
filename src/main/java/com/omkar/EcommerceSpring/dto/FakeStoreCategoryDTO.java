package com.omkar.EcommerceSpring.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreCategoryDTO {
    private String status;
    private String message;
    private List<String> categories;
}
