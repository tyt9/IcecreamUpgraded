package com.parfait.icecreamupgraded.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {
    private int orderId;
    private Date orderDateTime;
    private int totalAmount;
    private int del;

}
