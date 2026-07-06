package com.OnlineFoodDelivery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.OnlineFoodDelivery.dao.UserDAO;
import com.OnlineFoodDelivery.dbutil.DBConnection;
import com.OnlineFoodDelivery.model.User;

public class UserDAOImpl implements UserDAO {

    // Add User
    @Override
    public void addUser(User user) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO user(name,email,password,phone,address) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getAddress());

            ps.executeUpdate();

            System.out.println("User Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Get User By ID
    @Override
    public User getUserById(int userId) {

        User user = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM user WHERE user_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                user = new User();

                user.setUserId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;

    }

    // Update User
    @Override
    public void updateUser(User user) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE user SET name=?, email=?, password=?, phone=?, address=? WHERE user_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getAddress());
            ps.setInt(6, user.getUserId());

            ps.executeUpdate();

            System.out.println("User Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete User
    @Override
    public void deleteUser(int userId) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM user WHERE user_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, userId);

            ps.executeUpdate();

            System.out.println("User Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Login User
    @Override
    public User login(String email, String password) {

        User user = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM user WHERE email=? AND password=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                user = new User();

                user.setUserId(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;

    }

}