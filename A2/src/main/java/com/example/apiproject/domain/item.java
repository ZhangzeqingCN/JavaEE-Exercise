package com.example.apiproject.domain;

import lombok.*;

/**
 * @Auther HYT
 * @Date 2023/6/7
 * @Desc
 */
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class item {
    private String type;
    private String weight;
    private boolean insuranceOrNot;
    private String notes;

    public boolean getInsuranceOrNot() {
        return insuranceOrNot;
    }
}
