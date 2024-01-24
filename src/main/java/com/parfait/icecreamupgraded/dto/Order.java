package com.parfait.icecreamupgraded.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private List<Product> products;
    private List<Topping> toppings;
}
