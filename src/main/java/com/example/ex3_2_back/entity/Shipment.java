package com.example.ex3_2_back.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * 包裹物流
 */
@Entity
@Table(name = "Ship")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "ship_id")
    Integer id;

//    @OneToOne//用户名（需要设计外键？）
//    @Column(name = "fromUser")
    String fromUser;

//    @OneToOne//应该不需要双向一对一，因为一个人可以收和寄多个快递
//    @Column(name = "toUser")
    String toUser;

    String fromAddress;

    String toAddress;

    String toPhone;

    String fromPhone;

    String parcelTrace;
}
