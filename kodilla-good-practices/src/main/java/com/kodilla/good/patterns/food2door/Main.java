package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "banana", 10);
        Product product2 = new Product(2, "apple", 100);
        Product product3 = new Product(3, "pear", 11);

        List<Product> productList1 = new ArrayList<>();
        productList1.add(product1);
        productList1.add(product2);

        List<Product> productList2 = new ArrayList<>();
        productList1.add(product2);
        productList1.add(product3);

        Supplier tesco = new Supplier(1, "Tesco");
        Supplier lidl = new Supplier(2, "Lidl");

        Order order1 = new Order(1, LocalDateTime.of(2019, 11, 12, 12, 15), tesco, productList1);
        Order order2 = new Order(2, LocalDateTime.of(2019, 11, 13, 13, 15), lidl, productList2);

        OrderDto orderDto1 = new OrderDto(order1, true);
        OrderDto orderDto2 = new OrderDto(order2, false);

        OrderService service = new OrderService();

        service.processOrder(new TescoService(), orderDto1);
        service.processOrder(new LidlService(), orderDto2);

    }
}
