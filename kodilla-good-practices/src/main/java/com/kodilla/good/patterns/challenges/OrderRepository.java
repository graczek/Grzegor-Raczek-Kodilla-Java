package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRepository implements RentalRepository {
    @Override
    public void createOrder(User user, LocalDate orderDate) {
       user = new User("John", "Wayne");
       orderDate = LocalDate.of(2019, 1, 1);
       System.out.println(user);
       System.out.println(orderDate);
    }
}
