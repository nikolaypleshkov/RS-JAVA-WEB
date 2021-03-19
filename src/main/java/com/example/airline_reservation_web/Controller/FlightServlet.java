/*package com.example.airline_reservation_web.Controller;

import com.example.airline_reservation_web.Entity.Flight;
import com.example.airline_reservation_web.UserDao.FlightDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
@WebServlet("/add-list")
public class FlightServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String from = req.getParameter("city_from");
        String to = req.getParameter("city_to");

        Flight flight = new Flight();

        flight.setFrom(from);
        flight.setTo(to);

            FlightDao flightDao = new FlightDao();

        try {
            String table = flightDao.getFlight(flight);
            if(table.equals("Table")){
                PrintWriter out = resp.getWriter();
                out.print ("<table width=50% border=1>");
                out.print ("<caption>Flight List:</caption>");
                out.print("<br></br>");
                ResultSetMetaData resultSetMetaData = flightDao.rs().getMetaData();
                int total = resultSetMetaData.getColumnCount();

                out.print("<tr>");
                for(int i = 1; i <= total; i++){
                    out.print("<th>"+resultSetMetaData.getColumnName(i) + "<th>");
                }
                out.print("</tr>");

                while(flightDao.rs().next()){
                    out.print("<tr>
                    <td>"+flightDao.rs().getString(1)+"</td>
                    <td>"+flightDao.rs().getString(2)+"</td>
                    <td>"+flightDao.rs().getString(3)+"</td>
                    <td>"+flightDao.rs().getString(4)+"</td>
                    <td>"+flightDao.rs().getString(5)+"</td>
                    <td>"+flightDao.rs().getString(6)+"</td>
                    <td>"+flightDao.rs().getString(7)+"</td>
                    <td>");
                }
                out.print("</table>");

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}

 */
