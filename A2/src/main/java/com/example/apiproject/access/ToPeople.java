package com.example.apiproject.access;

import jakarta.persistence.*;
import lombok.*;

/**
 * 保存的收件人信息
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
@Table(name = "t_ToPeople")
public class ToPeople {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;//记录id

    @ManyToOne//多个寄件人对应一个用户
    User user;

    String toUser;
    String toPhone;
    String toAddressSelect;
    String toAddressDetail;
}
