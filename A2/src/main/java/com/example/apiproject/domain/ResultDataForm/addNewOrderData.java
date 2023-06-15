package com.example.apiproject.domain.ResultDataForm;

import lombok.*;

/**
 * @Auther HYT
 * @Date 2023/6/10
 * @Desc
 */
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class addNewOrderData {
    private String shippingCode;
    private String shipmentCode;
}
