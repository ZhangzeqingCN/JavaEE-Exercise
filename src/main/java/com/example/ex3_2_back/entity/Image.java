package com.example.ex3_2_back.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Blob;

@Entity
@Table(name = "t_image")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Lob
    private byte[] data;

    private String type;
}
