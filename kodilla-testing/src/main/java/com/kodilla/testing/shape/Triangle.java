package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private final String name = "triangle";
    private final Double field = 10.0;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return field;
    }
}
