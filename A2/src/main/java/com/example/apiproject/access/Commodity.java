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
    Integer id;//运单号
    String type;
    Float weight;
    boolean insuranceOrNot;
    String notes;
}
