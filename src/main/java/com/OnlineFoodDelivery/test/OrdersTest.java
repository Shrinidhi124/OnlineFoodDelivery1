package com.OnlineFoodDelivery.test;

import java.sql.Timestamp;

import com.OnlineFoodDelivery.dao.OrdersDAO;
import com.OnlineFoodDelivery.daoimpl.OrdersDAOImpl;
import com.OnlineFoodDelivery.model.Orders;

public class OrdersTest {

    public static void main(String[] args) {

        // Create Orders object
        Orders order = new Orders();

        // Existing User ID (Change this if your user ID is different)
        order.setUserId(2);

        // Order Details
        order.setTotalAmount(450.00);
        order.setDeliveryAddress("Mangalore");

        // Current Date and Time
        order.setOrderDate(new Timestamp(System.currentTimeMillis()));

        // Order Status
        order.setOrderStatus("Pending");

        // Create DAO object
        OrdersDAO dao = new OrdersDAOImpl();

        // Insert Order
        dao.addOrder(order);

        System.out.println("Order Added Successfully!");

    }

}