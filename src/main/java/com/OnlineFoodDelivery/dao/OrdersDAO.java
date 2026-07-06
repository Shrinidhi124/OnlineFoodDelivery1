package com.OnlineFoodDelivery.dao;

import com.OnlineFoodDelivery.model.Orders;

public interface OrdersDAO {

    void addOrder(Orders order);

    Orders getOrderById(int orderId);

    void updateOrder(Orders order);

    void deleteOrder(int orderId);

}