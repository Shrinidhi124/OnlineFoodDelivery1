package com.OnlineFoodDelivery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.OnlineFoodDelivery.dao.OrdersDAO;
import com.OnlineFoodDelivery.dbutil.DBConnection;
import com.OnlineFoodDelivery.model.Orders;

public class OrdersDAOImpl implements OrdersDAO {

    // Add Order
    @Override
    public void addOrder(Orders order) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO orders(user_id,total_amount,delivery_address,order_date,order_status) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, order.getUserId());
            ps.setDouble(2, order.getTotalAmount());
            ps.setString(3, order.getDeliveryAddress());
            ps.setTimestamp(4, order.getOrderDate());
            ps.setString(5, order.getOrderStatus());

            ps.executeUpdate();

            System.out.println("Order Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Get Order By ID
    @Override
    public Orders getOrderById(int orderId) {

        Orders order = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM orders WHERE order_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, orderId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                order = new Orders();

                order.setOrderId(rs.getInt("order_id"));
                order.setUserId(rs.getInt("user_id"));
                order.setTotalAmount(rs.getDouble("total_amount"));
                order.setDeliveryAddress(rs.getString("delivery_address"));
                order.setOrderDate(rs.getTimestamp("order_date"));
                order.setOrderStatus(rs.getString("order_status"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return order;

    }

    // Update Order
    @Override
    public void updateOrder(Orders order) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE orders SET user_id=?, total_amount=?, delivery_address=?, order_date=?, order_status=? WHERE order_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, order.getUserId());
            ps.setDouble(2, order.getTotalAmount());
            ps.setString(3, order.getDeliveryAddress());
            ps.setTimestamp(4, order.getOrderDate());
            ps.setString(5, order.getOrderStatus());
            ps.setInt(6, order.getOrderId());

            ps.executeUpdate();

            System.out.println("Order Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Order
    @Override
    public void deleteOrder(int orderId) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM orders WHERE order_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, orderId);

            ps.executeUpdate();

            System.out.println("Order Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}