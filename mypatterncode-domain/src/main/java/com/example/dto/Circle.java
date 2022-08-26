package com.example.dto;

import lombok.Data;

@Data
public class Circle extends Shape {
    //直径
    private Integer diameter;

    @Override
    public String getDescription() {
        return String.format("%s圆形", super.getRank());
    }
}
