package com.example.airline_reservation_web.Entity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/fetchdata")
public class FetchData extends HttpServlet {
    TableSearch search = new TableSearch();
    public String from;
    public String to;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         from ="Burgas,Bulgaria";
         to = "Berlin,Germany";
    }
}
