package com.codersdesks.paymentservice.dto;

import com.codersdesks.paymentservice.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceResponse {
    private Payment payment;
}
