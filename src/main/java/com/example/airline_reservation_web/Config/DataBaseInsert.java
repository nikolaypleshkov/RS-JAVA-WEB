package com.example.airline_reservation_web.Config;

import com.example.airline_reservation_web.Config.DataBaseConfig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(value = "/register-user")
public class DataBaseInsert extends HttpServlet {
   //  private static final long ID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        response.sendRedirect("register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Connection connection = DataBaseConfig.configDataBase();

            PreparedStatement statement = connection.prepareStatement("INSERT INTO usersdata(user_title,user_f_name,user_l_name,user_phone_number,user_email,user_pass) VALUE (?, ?, ?, ?,?,?)");
            statement.setString(1,"title");
            statement.setString(2,"fname");
            statement.setString(3,"lname");
            statement.setString(4,"phone");
            statement.setString(5,"email");
            statement.setString(6,"pass");

            statement.executeQuery();
            statement.close();
            connection.close();

            PrintWriter out = resp.getWriter();
            out.println("<html><body><b>Successfully Registered!"
                    + "</b></body></html>");

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
