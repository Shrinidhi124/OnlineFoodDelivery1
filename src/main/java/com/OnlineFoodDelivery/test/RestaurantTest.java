package com.OnlineFoodDelivery.test;

import com.OnlineFoodDelivery.dao.RestaurantDAO;
import com.OnlineFoodDelivery.daoimpl.RestaurantDAOImpl;

public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDAO dao = new RestaurantDAOImpl();

        dao.deleteRestaurant(1);

        System.out.println("Restaurant Deleted Successfully!");

    }

}