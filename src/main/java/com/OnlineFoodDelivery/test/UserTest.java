package com.OnlineFoodDelivery.test;

import com.OnlineFoodDelivery.dao.UserDAO;
import com.OnlineFoodDelivery.daoimpl.UserDAOImpl;

public class UserTest {

    public static void main(String[] args) {

        // Create DAO object
        UserDAO dao = new UserDAOImpl();

        // Delete User with ID 4
        dao.deleteUser(4);

        System.out.println("User Deleted Successfully!");

    }

}