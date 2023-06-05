package com.example.apiproject.domain.auth;

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
public class saveFromPeople {
    private String fromPeople;
    private String fromPhone;
    private String fromAddrSelect;
    private String fromAddrDetail;
}
