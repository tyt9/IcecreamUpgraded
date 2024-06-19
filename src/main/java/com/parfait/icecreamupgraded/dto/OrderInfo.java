package com.parfait.icecreamupgraded.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderInfo {
    private int orderId;
    private Date orderDateTime;
    private int totalAmount;
    private int detailId;
    private String productId;
    private String toppingDetailId;
    private String toppingId;
    private String productName;
    private String toppingName;
    private int quantity;
    private int toppingQuantity;
}
