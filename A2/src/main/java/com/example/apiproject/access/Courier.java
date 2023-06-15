package com.example.apiproject.access;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * 快递员表
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
@Entity
public class Courier {
    @Id
    String name;
    String phone;
}
