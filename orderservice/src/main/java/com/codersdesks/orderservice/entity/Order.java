package com.codersdesks.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDER_TABLE")
public class Order {

    @Id
    @GeneratedValue
    private int id;
    private Double price;
    private String itemName;
    private LocalDateTime orderTime;
    private String paymentStatus;
}
