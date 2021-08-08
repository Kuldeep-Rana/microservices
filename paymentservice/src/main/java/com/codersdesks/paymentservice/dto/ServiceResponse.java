package com.codersdesks.paymentservice.dto;

import com.codersdesks.paymentservice.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ServiceResponse {
    private Payment payment;
}
