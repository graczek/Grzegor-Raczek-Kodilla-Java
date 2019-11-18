package com.kodilla.good.patterns.food2door;

import java.util.List;

public class OrderConfirmation {
    private OrderConfirmationStatus status;
    private List<Product> confirmedProductList;
    private int orderId;
    private String supplierConfirmationNo;

    public OrderConfirmation(OrderConfirmationStatus status, List<Product> confirmedProductList, int orderId, String supplierConfirmationNo) {
        this.status = status;
        this.confirmedProductList = confirmedProductList;
        this.orderId = orderId;
        this.supplierConfirmationNo = supplierConfirmationNo;
    }

    public OrderConfirmationStatus getStatus() {
        return status;
    }

    public void setStatus(OrderConfirmationStatus status) {
        this.status = status;
    }

    public List<Product> getConfirmedProductList() {
        return confirmedProductList;
    }

    public void setConfirmedProductList(List<Product> confirmedProductList) {
        this.confirmedProductList = confirmedProductList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getSupplierConfirmationNo() {
        return supplierConfirmationNo;
    }

    public void setSupplierConfirmationNo(String supplierConfirmationNo) {
        this.supplierConfirmationNo = supplierConfirmationNo;
    }
}
