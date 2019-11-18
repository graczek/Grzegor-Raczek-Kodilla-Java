package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.List;

public class SupplierService implements OrderProcessor {

    @Override
    public OrderConfirmation process(OrderDto orderDto) throws InvalidOrderException {
        OrderConfirmationStatus orderConfirmationStatus = null;
        OrderConfirmation orderConfirmation = null;

        if(orderDto.isValidated() == false){
            orderConfirmationStatus.setConfirmed(false);
            throw new InvalidOrderException();
        } else {
            final LocalDateTime orderDate = getOrderDate(orderDto);
            final int orderId = getOrderId(orderDto);
            final List<Product> orderedProductsList = getOrderedProductList(orderDto);
            orderConfirmationStatus.setConfirmed(true);

            orderConfirmation.setSupplierConfirmationNo(orderId + orderDate.toString());
            orderConfirmation.setOrderId(orderId);
            orderConfirmation.setStatus(orderConfirmationStatus);
            orderConfirmation.setConfirmedProductList(addOrderProductsToOrderConfirmationProductsList(orderedProductsList));

        }
        return orderConfirmation;
    }

    private List<Product> addOrderProductsToOrderConfirmationProductsList(List<Product> orderedProductsList) {
        List<Product> confirmedProductList = null;
        for (Product product : orderedProductsList) {
            confirmedProductList.add(product);
        }
        return confirmedProductList;
    }

    private List<Product> getOrderedProductList(OrderDto orderDto) {
        return orderDto.order.getProducts();
    }

    private int getOrderId(OrderDto orderDto) {
        return orderDto.order.getId();
    }

    private LocalDateTime getOrderDate(OrderDto orderDto) {
        return orderDto.order.getDate();
    }


}

