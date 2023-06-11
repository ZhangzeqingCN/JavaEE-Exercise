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

    String fromUser;//姓名

    String toUser;

    String fromAddressSelect;

    String fromAddressDetail;

    String toAddressSelect;

    String toAddressDetail;

    String toPhone;//根据电话查包裹

    String fromPhone;

    @OneToOne
    Commodity commodity;//一个包裹对应一件物品

    String parcelTrace; // 包裹状态（待寄件、待发货、已发货、已签收）

    String placeAnOrderTime;//创建时间
    String chooseCourier;//快递员
    String paymentMethod;//付款方式
    String estimatedCost;//运费

    String shippingCode;//寄件码
}
