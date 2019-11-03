package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderService implements RentalService {
    @Override
    public boolean order(User user, LocalDate orderDate) {
        if(user == null || orderDate == null){
            return false;
        }
        return true;
    }
}
