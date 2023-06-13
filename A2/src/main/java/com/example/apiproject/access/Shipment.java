package com.example.apiproject.access;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "t_Shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @OneToOne
    User toUser;
    @OneToOne
    User fromUser;
    @OneToOne
    Address fromAddress;
    @OneToOne
    Address toAddress;
    @OneToOne
    Commodity commodity;
}
