package com.example.ex3_2_back.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.jetbrains.annotations.NotNull;

@Converter
public class GenderConverter implements AttributeConverter<Gender, Integer> {
    @Override
    public Integer convertToDatabaseColumn(@NotNull Gender g) {
        return g.code;
    }

    @Override
    public Gender convertToEntityAttribute(@NotNull Integer code) {
        return switch (code) {
            case 1 -> Gender.Male;
            case 2 -> Gender.Female;
            default -> Gender.Unknown;
        };
    }
}
