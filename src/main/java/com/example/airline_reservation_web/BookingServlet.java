package com.example.airline_reservation_web;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bookingPage", value = "/book-servlet")
public class BookingServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("book.jsp");

    }

    public void destroy() {
    }
}