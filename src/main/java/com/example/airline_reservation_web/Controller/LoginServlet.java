package com.example.airline_reservation_web.Controller;
import com.example.airline_reservation_web.Entity.User;
import com.example.airline_reservation_web.Dao.LoginDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//need fix!!!!
@WebServlet(name = "register", value="/login-user")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("log_email");
        String password = req.getParameter("log_pass");
        PrintWriter out = resp.getWriter();
        User user = new User();

        user.setEmail(email);
        user.setEmail(password);

        LoginDao loginDao = new LoginDao();

        String userLogin = loginDao.loginUser(user);

        if(userLogin.equals("Login")){
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
        else{
            req.setAttribute("Error",userLogin);
            out.print("<h1>Wrong Email/Password</h1>");

        }
    }
}


