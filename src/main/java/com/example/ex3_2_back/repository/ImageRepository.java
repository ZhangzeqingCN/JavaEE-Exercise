package com.example.ex3_2_back.repository;

import com.example.ex3_2_back.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
