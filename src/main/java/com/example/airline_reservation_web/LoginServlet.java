package com.example.airline_reservation_web;

import com.example.airline_reservation_web.Config.DataBaseConfig;
import com.example.airline_reservation_web.Entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginPage", value = "/login-servlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        User user = new User();

        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("pass"));

        if(user.getEmail().equals("icelol@abv.bg") && user.getPassword().equals("645312niki")){
            RequestDispatcher rs = req.getRequestDispatcher("book.jsp");
            rs.forward(req, resp);

        }
        else{
            out.println("Username or Password incorrect");
            RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
            rs.include(req, resp);
        }


    }
}
