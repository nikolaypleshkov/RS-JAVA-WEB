package com.example.airline_reservation_web.Entity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/flights-list")
public class TableSearch extends HttpServlet {
    private String from_city;
    private String to_city;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getParameter("flight-search") != null){
            setFrom_city(req.getParameter("city_from"));
            setTo_city(req.getParameter("city_to"));

        }
    }

    public String getFrom_city() {
        return from_city;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city() {
        return to_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }
}
