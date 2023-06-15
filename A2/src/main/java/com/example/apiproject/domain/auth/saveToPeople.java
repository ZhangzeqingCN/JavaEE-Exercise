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
public class saveToPeople {
    private String toPeople;
    private String toPhone;
    private String toAddrSelect;
    private String toAddrDetail;
}
