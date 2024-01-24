package com.parfait.icecreamupgraded.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Topping {
    private String toppingId;
    private String toppingName;
    private int quantity;
    private int additionalPrice;
}
