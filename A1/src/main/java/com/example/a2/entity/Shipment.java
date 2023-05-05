package com.example.a2.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * 包裹物流
 */
@Entity
@Table(name = "t_ship")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id; // 包裹ID

    @OneToOne//用户名（需要设计外键？）
    @JoinColumn(name = "from_user_id")
    User fromUser;

    @OneToOne//应该不需要双向一对一，因为一个人可以收和寄多个快递
    @JoinColumn(name = "to_user_id")
    User toUser;

    String fromAddress;

    String toAddress;

    String toPhone;

    String fromPhone;

    String parcelTrace; // 包裹轨迹
    Float weight;
    Float volume;
}
