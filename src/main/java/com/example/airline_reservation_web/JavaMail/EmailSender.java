package com.example.airline_reservation_web.JavaMail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailSender extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name=req.getParameter("name");
        String from=req.getParameter("email");
        String subject=req.getParameter("subject");
        String message=req.getParameter("message");

        Mailer.send(name,from,subject,message);
    }
}
