package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderValidationHandler implements OrderValidator {
    @Override
    public OrderDto validateOrder(Order order) {
        OrderDto orderDto = new OrderDto(order, false);
        if(order.equals(null) || order.getDate().isBefore(LocalDateTime.now())
                || order.getId() <= 0 || order.getProducts().isEmpty() || order.getSupplier().equals(null)){
            return orderDto;
        } return new OrderDto(order, true);
    }
}
