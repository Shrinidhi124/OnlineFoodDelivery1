package com.OnlineFoodDelivery.test;

import com.OnlineFoodDelivery.dao.OrderItemDAO;
import com.OnlineFoodDelivery.daoimpl.OrderItemDAOImpl;
import com.OnlineFoodDelivery.model.OrderItem;

public class OrderItemTest {

    public static void main(String[] args) {

        // Create OrderItem object
        OrderItem item = new OrderItem();

        // Existing Order ID
        item.setOrderId(1);

        // Existing Menu ID
        item.setMenuId(4);

        // Quantity
        item.setQuantity(2);

        // Price
        item.setPrice(360.00);

        // DAO Object
        OrderItemDAO dao = new OrderItemDAOImpl();

        // Insert Order Item
        dao.addOrderItem(item);

        System.out.println("Order Item Added Successfully!");

    }

}