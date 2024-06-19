package com.parfait.icecreamupgraded.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ToppingDetailPlusName {
    private int toppingDetailId;
    private int orderDetailId;
    private String toppingId;
    private int toppingQuantity;
    private String toppingName;
}
