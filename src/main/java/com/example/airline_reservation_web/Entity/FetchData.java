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
    private String from;
    private String to;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        setFrom("Burgas,Bulgaria");
        setTo("Berlin,Germany");

        System.out.println(getFrom()+" "+getTo());

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
