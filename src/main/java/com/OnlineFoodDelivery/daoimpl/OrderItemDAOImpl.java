package com.OnlineFoodDelivery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.OnlineFoodDelivery.dao.OrderItemDAO;
import com.OnlineFoodDelivery.dbutil.DBConnection;
import com.OnlineFoodDelivery.model.OrderItem;

public class OrderItemDAOImpl implements OrderItemDAO {

    // Add Order Item
    @Override
    public void addOrderItem(OrderItem orderItem) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO order_item(order_id, menu_id, quantity, price) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, orderItem.getOrderId());
            ps.setInt(2, orderItem.getMenuId());
            ps.setInt(3, orderItem.getQuantity());
            ps.setDouble(4, orderItem.getPrice());

            ps.executeUpdate();

            System.out.println("Order Item Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Get Order Item By ID
    @Override
    public OrderItem getOrderItemById(int orderItemId) {

        OrderItem orderItem = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM order_item WHERE order_item_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, orderItemId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                orderItem = new OrderItem();

                orderItem.setOrderItemId(rs.getInt("order_item_id"));
                orderItem.setOrderId(rs.getInt("order_id"));
                orderItem.setMenuId(rs.getInt("menu_id"));
                orderItem.setQuantity(rs.getInt("quantity"));
                orderItem.setPrice(rs.getDouble("price"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return orderItem;

    }

    // Update Order Item
    @Override
    public void updateOrderItem(OrderItem orderItem) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE order_item SET order_id=?, menu_id=?, quantity=?, price=? WHERE order_item_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, orderItem.getOrderId());
            ps.setInt(2, orderItem.getMenuId());
            ps.setInt(3, orderItem.getQuantity());
            ps.setDouble(4, orderItem.getPrice());
            ps.setInt(5, orderItem.getOrderItemId());

            ps.executeUpdate();

            System.out.println("Order Item Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Order Item
    @Override
    public void deleteOrderItem(int orderItemId) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM order_item WHERE order_item_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, orderItemId);

            ps.executeUpdate();

            System.out.println("Order Item Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}