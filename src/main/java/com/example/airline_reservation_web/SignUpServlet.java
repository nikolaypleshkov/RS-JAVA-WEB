package com.example.airline_reservation_web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Register", value = "/signup-servlet")
public class SignUpServlet extends HttpServlet {
    public void init() {

    }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.sendRedirect("signup.jsp");
        }
    public void destroy() {
    }
}
