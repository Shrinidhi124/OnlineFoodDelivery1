package com.OnlineFoodDelivery.model;

import java.sql.Timestamp;

public class Orders {

    private int orderId;
    private int userId;
    private double totalAmount;
    private String deliveryAddress;
    private Timestamp orderDate;
    private String orderStatus;

    // Default Constructor
    public Orders() {

    }

    // Parameterized Constructor
    public Orders(int orderId, int userId, double totalAmount,
            String deliveryAddress, Timestamp orderDate, String orderStatus) {

        this.orderId = orderId;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.deliveryAddress = deliveryAddress;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

}