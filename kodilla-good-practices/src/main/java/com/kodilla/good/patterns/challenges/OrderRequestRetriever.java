package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Doe");

        LocalDate orderDate = LocalDate.of(2019, 5, 1);

        return new OrderRequest(user, orderDate);
    }
}
