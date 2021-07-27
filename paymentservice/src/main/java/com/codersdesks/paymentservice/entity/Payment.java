package com.codersdesks.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PAYMENT_TABLE")
public class Payment {

    @Id
    @GeneratedValue
    private int id;
    private int orderId;
    private Double amount;
    private String transactionId;
    private LocalDateTime paymentTime;
    private String paymentStatus;
}
