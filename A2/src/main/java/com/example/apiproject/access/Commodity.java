package com.example.apiproject.access;

import jakarta.persistence.*;
import lombok.*;

/**
 * 包裹里面的物品信息表
 */
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "t_Commodity")
public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;//记录号
    String type;//类型
    Float weight;//重量
    boolean insuranceOrNot;//是否保价
    String notes;//备注
}
