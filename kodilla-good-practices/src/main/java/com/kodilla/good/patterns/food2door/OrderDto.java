package com.kodilla.good.patterns.food2door;

public class OrderDto {

    public Order order;
    public boolean isValidated;

    public OrderDto(Order order, boolean isValidated) {
        this.order = order;
        this.isValidated = isValidated;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isValidated() {
        return isValidated;
    }
}
