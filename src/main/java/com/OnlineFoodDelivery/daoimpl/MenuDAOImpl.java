package com.OnlineFoodDelivery.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.OnlineFoodDelivery.dao.MenuDAO;
import com.OnlineFoodDelivery.dbutil.DBConnection;
import com.OnlineFoodDelivery.model.Menu;

public class MenuDAOImpl implements MenuDAO {

    // Add Menu Item
    @Override
    public void addMenu(Menu menu) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO menu(restaurant_id,item_name,description,price,availability) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, menu.getRestaurantId());
            ps.setString(2, menu.getItemName());
            ps.setString(3, menu.getDescription());
            ps.setDouble(4, menu.getPrice());
            ps.setString(5, menu.getAvailability());

            ps.executeUpdate();

            System.out.println("Menu Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Get Menu By ID
    @Override
    public Menu getMenuById(int menuId) {

        Menu menu = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM menu WHERE menu_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, menuId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                menu = new Menu();

                menu.setMenuId(rs.getInt("menu_id"));
                menu.setRestaurantId(rs.getInt("restaurant_id"));
                menu.setItemName(rs.getString("item_name"));
                menu.setDescription(rs.getString("description"));
                menu.setPrice(rs.getDouble("price"));
                menu.setAvailability(rs.getString("availability"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return menu;

    }

    // Update Menu
    @Override
    public void updateMenu(Menu menu) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE menu SET restaurant_id=?, item_name=?, description=?, price=?, availability=? WHERE menu_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, menu.getRestaurantId());
            ps.setString(2, menu.getItemName());
            ps.setString(3, menu.getDescription());
            ps.setDouble(4, menu.getPrice());
            ps.setString(5, menu.getAvailability());
            ps.setInt(6, menu.getMenuId());

            ps.executeUpdate();

            System.out.println("Menu Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Menu
    @Override
    public void deleteMenu(int menuId) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM menu WHERE menu_id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, menuId);

            ps.executeUpdate();

            System.out.println("Menu Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}