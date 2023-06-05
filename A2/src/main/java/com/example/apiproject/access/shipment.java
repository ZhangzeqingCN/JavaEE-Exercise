package com.example.apiproject.access;

import jakarta.persistence.*;
import lombok.*;

/**
 * @Auther HYT
 * @Date 2023/6/5
 * @Desc
 */
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "t_ship")
public class shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id; // 包裹ID

//    @JoinColumn(name = "from_user_id")
    String fromUser;//姓名

//    @JoinColumn(name = "to_user_id")
    String toUser;

    String fromAddress;

    String toAddress;

    String toPhone;//根据电话查包裹

    String fromPhone;

    String parcelTrace; // 包裹状态（待发货、已发货、已签收）

    Float weight;

    Float volume;//体积

    Float cost;//运费
}
