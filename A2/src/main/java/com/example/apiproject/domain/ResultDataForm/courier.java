package com.example.apiproject.domain.ResultDataForm;

import lombok.*;

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
public class courier {
    private String courierName;
    private String courierPhone;
}
