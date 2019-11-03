package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate oderDate;

    public OrderRequest(User user, LocalDate oderDate) {
        this.user = user;
        this.oderDate = oderDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOderDate() {
        return oderDate;
    }

}
