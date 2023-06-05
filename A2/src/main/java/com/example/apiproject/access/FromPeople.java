package com.example.apiproject.access;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    Integer id;//记录id

    @ManyToOne//多个寄件人对应一个用户
    User user;

    String fromUser;
    String fromPhone;
    String fromAddress;
    String toUser;
    String toPhone;
    String toAddress;
}
