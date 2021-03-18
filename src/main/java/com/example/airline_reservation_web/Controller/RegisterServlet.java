package com.example.airline_reservation_web.Controller;

import com.example.airline_reservation_web.Entity.User;
import com.example.airline_reservation_web.UserDao.RegDao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "register", value="/register-user")
public class RegisterServlet extends HttpServlet {
    User user = new User();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first_name = req.getParameter("first_name");
        String last_name = req.getParameter("last_name");
        String email = req.getParameter("email");
        String password = req.getParameter("pass");
        String date = req.getParameter("date");

        User user = new User();
        user.setFirst_name(first_name);
        user.setLast_name(last_name);
        user.setEmail(email);
        user.setPassword(password);
        user.setDate_of_birth(date);

        RegDao regDao = new RegDao();

        String userRegistered = regDao.registerUser(user);

        if(userRegistered.equals("registered")){
            req.getRequestDispatcher("signin.jsp").forward(req,resp);
        }
        else{
            req.setAttribute("Error",userRegistered);
            req.getRequestDispatcher("signup.jsp").forward(req,resp);
        }

    }
}
