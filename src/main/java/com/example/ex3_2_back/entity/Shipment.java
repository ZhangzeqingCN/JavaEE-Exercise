package com.example.ex3_2_back.entity;

import jakarta.persistence.*;

@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    @OneToOne
    User fromUser;

    @OneToOne
    User toUser;

    String fromAddress;

    String toAddress;
}
