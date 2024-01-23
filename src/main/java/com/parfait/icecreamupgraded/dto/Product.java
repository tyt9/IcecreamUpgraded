package com.parfait.icecreamupgraded.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private String productId;
    private String productName;
    private int price;
    private int stockQuantity;
}
