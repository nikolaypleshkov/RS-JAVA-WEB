package com.example.airline_reservation_web.Controller;

import com.example.airline_reservation_web.Entity.Flight;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
;
@WebServlet("/add-list")
public class FlightServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String from = req.getParameter("from-td");
        String to = req.getParameter("to-td");
        String airport = req.getParameter("airport-td");
        String airline = req.getParameter("flight-name");
        String flight_number = req.getParameter("flight_numb");

        Flight flight = new Flight();

        flight.setFrom(from);
        flight.setTo(to);
        flight.setFlight_number(flight_number);
        flight.setAirline(airline);
        flight.setAirport(airport);

    }
}


