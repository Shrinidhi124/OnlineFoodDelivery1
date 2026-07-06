package com.OnlineFoodDelivery.servlet;

import java.io.IOException;
import java.util.ArrayList;

import com.OnlineFoodDelivery.model.CartItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String itemName = request.getParameter("item");
        double price = Double.parseDouble(request.getParameter("price"));

        HttpSession session = request.getSession();

        ArrayList<CartItem> cart =
                (ArrayList<CartItem>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<CartItem>();
        }

        boolean found = false;

        for (CartItem item : cart) {

            if (item.getItemName().equals(itemName)) {

                item.setQuantity(item.getQuantity() + 1);

                found = true;

                break;
            }
        }

        if (!found) {

            CartItem item = new CartItem(itemName, price, 1);

            cart.add(item);
        }
        session.setAttribute("cart", cart);

        session.setAttribute("message", "Item Added Successfully!");

        response.sendRedirect("menu.jsp");
        
    }

}