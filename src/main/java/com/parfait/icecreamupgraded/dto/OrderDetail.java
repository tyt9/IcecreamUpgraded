package com.parfait.icecreamupgraded.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetail {
    private int detailId;
    private int orderId;
    private String productId;
    private int quantity;
}
