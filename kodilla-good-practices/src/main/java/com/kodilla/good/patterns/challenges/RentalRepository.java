package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface RentalRepository {
    void createOrder(User user, LocalDate orderDate);
}
