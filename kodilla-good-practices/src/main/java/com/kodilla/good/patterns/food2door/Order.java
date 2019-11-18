package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;
    private LocalDateTime date;
    private Supplier supplier;
    private List<Product> products;

    public Order(int id, LocalDateTime date, Supplier supplier, List<Product> products) {
        this.id = id;
        this.date = date;
        this.supplier = supplier;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getProducts() {
        return products;
    }
}
