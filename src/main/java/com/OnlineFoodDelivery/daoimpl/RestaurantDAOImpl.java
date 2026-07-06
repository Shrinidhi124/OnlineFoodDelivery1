package com.OnlineFoodDelivery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.OnlineFoodDelivery.dao.RestaurantDAO;
import com.OnlineFoodDelivery.dbutil.DBConnection;
import com.OnlineFoodDelivery.model.Restaurant;

public class RestaurantDAOImpl implements RestaurantDAO {

    // Add Restaurant
    @Override
    public void addRestaurant(Restaurant restaurant) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO restaurant(restaurant_name,address,phone,cuisine_type,rating,image_url) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, restaurant.getRestaurantName());
            ps.setString(2, restaurant.getAddress());
            ps.setString(3, restaurant.getPhone());
            ps.setString(4, restaurant.getCuisineType());
            ps.setDouble(5, restaurant.getRating());
            ps.setString(6, restaurant.getImageUrl());

            ps.executeUpdate();

            System.out.println("Restaurant Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Get Restaurant By ID
    @Override
    public Restaurant getRestaurantById(int restaurantId) {

        Restaurant restaurant = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM restaurant WHERE restaurant_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, restaurantId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                restaurant = new Restaurant();

                restaurant.setRestaurantId(rs.getInt("restaurant_id"));
                restaurant.setRestaurantName(rs.getString("restaurant_name"));
                restaurant.setAddress(rs.getString("address"));
                restaurant.setPhone(rs.getString("phone"));
                restaurant.setCuisineType(rs.getString("cuisine_type"));
                restaurant.setRating(rs.getDouble("rating"));
                restaurant.setImageUrl(rs.getString("image_url"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return restaurant;
    }

    // Update Restaurant
    @Override
    public void updateRestaurant(Restaurant restaurant) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE restaurant SET restaurant_name=?, address=?, phone=?, cuisine_type=?, rating=?, image_url=? WHERE restaurant_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, restaurant.getRestaurantName());
            ps.setString(2, restaurant.getAddress());
            ps.setString(3, restaurant.getPhone());
            ps.setString(4, restaurant.getCuisineType());
            ps.setDouble(5, restaurant.getRating());
            ps.setString(6, restaurant.getImageUrl());
            ps.setInt(7, restaurant.getRestaurantId());

            ps.executeUpdate();

            System.out.println("Restaurant Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Restaurant
    @Override
    public void deleteRestaurant(int restaurantId) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM restaurant WHERE restaurant_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, restaurantId);

            ps.executeUpdate();

            System.out.println("Restaurant Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}