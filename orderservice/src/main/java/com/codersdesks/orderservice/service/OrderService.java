package com.codersdesks.orderservice.service;

import com.codersdesks.orderservice.dto.*;
import com.codersdesks.orderservice.entity.Order;
import com.codersdesks.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public ServiceResponse createOrder(ServiceRequest request) {
        Order order = request.getOrder();
        order.setOrderTime(LocalDateTime.now());
        repository.save(order);

        Payment payment = new Payment();
        payment.setAmount(order.getPrice());
        payment.setOrderId(order.getId());

        PaymentServiceRequest paymentRequest = new PaymentServiceRequest(payment);
        PaymentServiceResponse response = restTemplate.postForObject("http://localhost:9090/payment/pay",paymentRequest, PaymentServiceResponse.class);
        payment = response.getPayment();
        order.setPaymentStatus(payment.getPaymentStatus());
        repository.save(order);
        return new ServiceResponse(order,payment);
    }
}
