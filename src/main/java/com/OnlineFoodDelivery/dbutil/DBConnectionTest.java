package com.OnlineFoodDelivery.dbutil;

	import java.sql.Connection;

	public class DBConnectionTest {

	    public static void main(String[] args) {

	        // Get connection from DBConnection class
	        Connection connection = DBConnection.getConnection();

	        // Check whether connection is successful
	        if (connection != null) {
	            System.out.println("Connection Test Successful!");
	        } else {
	            System.out.println("Connection Failed!");
	        }
	    }
	}


