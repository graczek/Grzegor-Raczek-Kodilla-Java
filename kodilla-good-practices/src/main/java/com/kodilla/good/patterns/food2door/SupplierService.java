package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class SupplierService implements OrderValidator, OrderProcessor {

    @Override
    public boolean validateOrder(Order order) {
        if(order.equals(null) || order.getDate().isBefore(LocalDateTime.now())
                || order.getId() <= 0 || order.getProducts().isEmpty() || order.getSupplier().equals(null)){
            return false;
        } return true;
    }

    @Override
    public boolean process(Order order) {
        if(validateOrder(order) == false){
            return false;
        }
        System.out.println("Processing details of order to particular supplier");
        return true;
    }


}

