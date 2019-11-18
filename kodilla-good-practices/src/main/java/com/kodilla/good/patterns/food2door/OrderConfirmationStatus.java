package com.kodilla.good.patterns.food2door;

public class OrderConfirmationStatus {
    boolean confirmed;

    public OrderConfirmationStatus(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}
