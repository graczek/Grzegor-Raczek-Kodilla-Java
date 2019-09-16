package com.kodilla.testing.shape;

public class Circle implements Shape {
    private final String name = "circle";
    private final Double field = 15.0;

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return field;
    }
}
