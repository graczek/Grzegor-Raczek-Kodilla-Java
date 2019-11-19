package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.List;

public class TescoService implements OrderProcessor {

    @Override
    public OrderConfirmation process(OrderDto orderDto)  {
        System.out.println("Welcome to Tesco!");

        Order order = orderDto.getOrder();
        int id = order.getId();
        List<Product> products = order.getProducts();
        LocalDateTime orderDate = order.getDate();
        String supplierConfirmationNo = new String(id +orderDate.toString());

        OrderConfirmation confirmation = new OrderConfirmation(OrderConfirmationStatus.CONFIRMED, products, id, supplierConfirmationNo);
        return confirmation;
    }


}



