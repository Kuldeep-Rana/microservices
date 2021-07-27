package com.codersdesks.orderservice.dto;

import com.codersdesks.orderservice.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRequest {

    private Order order;

}
