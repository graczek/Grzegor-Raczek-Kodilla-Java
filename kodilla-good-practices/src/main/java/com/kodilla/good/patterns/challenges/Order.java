package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Order {

    private User customer;
    private LocalDate orderDate;

    public Order(User customer, LocalDate orderDate) {
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", orderDate=" + orderDate +
                '}';
    }
}
