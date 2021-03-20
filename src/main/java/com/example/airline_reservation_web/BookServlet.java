package com.example.airline_reservation_web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String book_btn = req.getParameter("book-btn");

        if(book_btn.equals("booking")){
            resp.sendRedirect("contact.jsp");
        }
    }
}
