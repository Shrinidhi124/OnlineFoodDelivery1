package com.OnlineFoodDelivery.test;

import com.OnlineFoodDelivery.dao.MenuDAO;
import com.OnlineFoodDelivery.daoimpl.MenuDAOImpl;

public class MenuTest {

    public static void main(String[] args) {

        MenuDAO dao = new MenuDAOImpl();

        dao.deleteMenu(10);

        System.out.println("Menu Deleted Successfully!");

    }

}