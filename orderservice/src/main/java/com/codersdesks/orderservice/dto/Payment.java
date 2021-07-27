package com.codersdesks.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private int id;
    private int orderId;
    private Double amount;
    private String transactionId;
    private LocalDateTime paymentTime;
    private String paymentStatus;
}
