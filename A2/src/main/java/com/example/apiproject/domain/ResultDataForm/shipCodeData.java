package com.example.apiproject.domain.ResultDataForm;

import lombok.*;
import com.example.apiproject.domain.auth.*;

/**
 * @Auther HYT
 * @Date 2023/6/14
 * @Desc
 */
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class shipCodeData {
    private String shipmentCode;
    private saveFromPeople fromPeople;
    private saveToPeople toPeople;
    private item item;
    private courier courier;
    private String placeAnOrderTime;
}
