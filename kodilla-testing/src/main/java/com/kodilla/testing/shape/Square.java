package com.kodilla.testing.shape;

public class Square implements Shape {
    private final String name = "square";
    private final Double field = 5.0;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return field;
    }
}
