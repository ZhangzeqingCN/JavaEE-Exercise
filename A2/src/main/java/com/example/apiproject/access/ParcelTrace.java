package com.example.apiproject.access;

import jakarta.persistence.*;
import lombok.*;

/**
 * 单个包裹物流信息（待定）
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
@Table(name = "t_ParcelTrace")
public class ParcelTrace {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;//物流信息记录

    @ManyToOne//多个物流信息对应一个包裹订单
    shipment shipment;

    String siteName;//站点名称
    String arriveTime;//到达时间
    String leaveTime;//离开时间
    String attribute;//属于中转站还是起点终点
}
