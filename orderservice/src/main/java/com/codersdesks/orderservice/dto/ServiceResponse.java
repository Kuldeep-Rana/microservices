package com.codersdesks.orderservice.dto;

import com.codersdesks.orderservice.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceResponse {
    private Order order;
    private Payment payment;
}
