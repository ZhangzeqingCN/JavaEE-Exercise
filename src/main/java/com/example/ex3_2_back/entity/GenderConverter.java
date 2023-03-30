package com.example.ex3_2_back.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class GenderConverter implements AttributeConverter<Gender, Integer> {
    @Override
    public Integer convertToDatabaseColumn(Gender g) {
        return g.code;
    }

    @Override
    public Gender convertToEntityAttribute(Integer code) {
        return switch (code) {
            case 1 -> Gender.Male;
            case 2 -> Gender.Female;
            default -> Gender.Unknown;
        };
    }
}
