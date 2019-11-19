package com.kodilla.good.patterns.food2door;

public class OrderService {
    public void processOrder(OrderProcessor orderProcessor, OrderDto orderDto){
        OrderConfirmation confirmation = orderProcessor.process(orderDto);

        if(confirmation.getStatus().equals(OrderConfirmationStatus.CONFIRMED)){
            System.out.println("Processing order...");
        } else {
            System.out.println("Order invalid. Please contact us");
        }
    }
}
