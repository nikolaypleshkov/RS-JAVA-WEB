package com.example.airline_reservation_web.Config;


import com.example.airline_reservation_web.Entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;


public class DataBaseConfig extends HttpServlet {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/usersData";
    static final String USER = "root";
    static final String PASSWORD = "root";

    protected static Connection configDataBase() throws SQLException ,ClassNotFoundException{

       Class.forName(DRIVER);
       Connection conection = DriverManager.getConnection(URL,USER,PASSWORD);

       return conection;
    }

}
