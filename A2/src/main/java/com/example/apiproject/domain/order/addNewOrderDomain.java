package com.example.apiproject.domain.order;

import lombok.*;
import com.example.apiproject.domain.auth.*;

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
public class addNewOrderDomain {
    private saveFromPeople fromPeople;
    private saveToPeople toPeople;
    private com.example.apiproject.domain.ResultDataForm.item item;
    private String placeAnOrderTime;//创建时间
    private String chooseCourier;//快递员
    private String paymentMethod;//付款方式
    private String estimatedCost;//运费

}
