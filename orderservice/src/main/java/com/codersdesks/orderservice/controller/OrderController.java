package com.codersdesks.orderservice.controller;

import com.codersdesks.orderservice.dto.ServiceRequest;
import com.codersdesks.orderservice.dto.ServiceResponse;
import com.codersdesks.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/create")
    public ServiceResponse pay(@RequestBody ServiceRequest request){

        return service.createOrder(request);
    }
}
