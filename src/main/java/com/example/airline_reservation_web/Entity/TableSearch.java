package com.example.airline_reservation_web.Entity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet("/add-list")
public class TableSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
      PrintWriter out = resp.getWriter();
      String from = "Burgas,Bulgaria";
      String to = "Berlin,Germany";

        try
        {
            TableSearch search = new TableSearch();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/usersData","root","root");
            PreparedStatement preparedStatement = con.prepareStatement("select * from flights WHERE flight_from=? AND flight_to=?;");
            preparedStatement.setString(1,from);
            preparedStatement.setString(2,to);

            out.print ("<table width=50% border=1>");
            out.print ("<caption>Flight List:</caption>");

            ResultSet rs = preparedStatement.executeQuery();

            out.print("<br></br>");
            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            int total = resultSetMetaData.getColumnCount();

            out.print("<tr>");
            for(int i = 1; i <= total; i++){
                out.print("<th>"+resultSetMetaData.getColumnName(i) + "<th>");
            }
            out.print("</tr>");

            while(rs.next()){
                out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>");
            }
            out.print("</table>");

    }catch (Exception e){
        e.printStackTrace();
        }
        finally {
            out.close();;
        }
    }

}
