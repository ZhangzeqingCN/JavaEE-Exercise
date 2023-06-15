package com.example.apiproject.access;

import jakarta.persistence.*;
import lombok.*;

/**
 * 保存的寄件人信息
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
@Table(name = "t_FromPeople")
public class FromPeople {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;//记录id

    @ManyToOne//多个寄件人对应一个用户
    User user;

    String fromUser;
    String fromPhone;
    String fromAddressSelect;
    String fromAddressDetail;
}
