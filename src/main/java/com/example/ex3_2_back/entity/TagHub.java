package com.example.ex3_2_back.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tag_hub")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TagHub {
    @Id
    @Column(name = "keyword_id")
    Integer id;
    @Column(name = "keyword_name")
    String name;
}
