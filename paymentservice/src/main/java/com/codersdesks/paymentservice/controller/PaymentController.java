package com.codersdesks.paymentservice.controller;

import com.codersdesks.paymentservice.dto.ServiceRequest;
import com.codersdesks.paymentservice.dto.ServiceResponse;
import com.codersdesks.paymentservice.entity.Payment;
import com.codersdesks.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/pay")
    public ServiceResponse pay(@RequestBody ServiceRequest request){

        return service.pay(request);
    }
}
