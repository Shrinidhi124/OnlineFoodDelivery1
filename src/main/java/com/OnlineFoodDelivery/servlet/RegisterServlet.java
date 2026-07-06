package com.OnlineFoodDelivery.servlet;

import java.io.IOException;

import com.OnlineFoodDelivery.dao.UserDAO;
import com.OnlineFoodDelivery.daoimpl.UserDAOImpl;
import com.OnlineFoodDelivery.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Get data from registration form
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        // Create User object
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        user.setAddress(address);

        // Save user into database
        UserDAO dao = new UserDAOImpl();

        dao.addUser(user);

        // Redirect to Login page
        response.sendRedirect("login.jsp");

    }

}