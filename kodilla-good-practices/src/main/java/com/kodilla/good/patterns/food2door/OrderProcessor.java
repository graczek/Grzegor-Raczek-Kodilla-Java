package com.kodilla.good.patterns.food2door;

public interface OrderProcessor {
    OrderConfirmation process(OrderDto orderDto);
}
