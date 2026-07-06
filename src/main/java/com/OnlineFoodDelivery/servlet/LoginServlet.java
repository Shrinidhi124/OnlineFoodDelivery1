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
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDAO dao = new UserDAOImpl();

        User user = dao.login(email, password);

        if (user != null) {

            HttpSession session = request.getSession();

            session.setAttribute("user", user);

            response.sendRedirect("home.jsp");

        } else {

            response.sendRedirect("login.jsp");

        }

    }

}