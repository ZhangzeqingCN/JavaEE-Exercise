package com.example.apiproject.access;

import com.example.apiproject.access.User;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "t_Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @ManyToOne
    User ofUser;

    String province;
    String city;
    String district;
    String detail;
}
