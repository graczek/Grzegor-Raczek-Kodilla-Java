package com.kodilla.good.patterns.food2door;

public class Supplier {
    private int id;
    private String name;

    public Supplier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
