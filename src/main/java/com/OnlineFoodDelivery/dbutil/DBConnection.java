package com.OnlineFoodDelivery.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    // Database URL
    private static final String URL = "jdbc:mysql://localhost:3306/online_food_delivery";

    // MySQL Username
    private static final String USERNAME = "root";

    // MySQL Password
    private static final String PASSWORD = "Root@123";

    // Method to create database connection
    public static Connection getConnection() {

        Connection connection = null;

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection with database
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {

            // Print error if connection fails
            e.printStackTrace();
        }

        return connection;
    }
}