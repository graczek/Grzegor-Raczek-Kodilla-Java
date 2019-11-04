package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRepository implements RentalRepository {
    @Override
    public void createOrder(User user, LocalDate orderDate) {

        Order newOrder = new Order(user, orderDate);
        System.out.println(newOrder);
    }
}
