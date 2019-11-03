package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface RentalService {
    boolean order(User user, LocalDate orderDate);
}
