package com.codersdesks.paymentservice.service;

import com.codersdesks.paymentservice.dto.ServiceRequest;
import com.codersdesks.paymentservice.dto.ServiceResponse;
import com.codersdesks.paymentservice.entity.Payment;
import com.codersdesks.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public ServiceResponse pay(ServiceRequest request) {
        Payment payment = request.getPayment();
        payment.setPaymentStatus(new Random().nextBoolean() == true ? "SUCCESS" : "FAILED");
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentTime(LocalDateTime.now());
        repository.save(payment);

        return new ServiceResponse(payment);
    }
}
