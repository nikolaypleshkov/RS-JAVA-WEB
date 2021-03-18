package com.example.airline_reservation_web.Config;


import javax.servlet.http.HttpServlet;

import java.sql.*;


public class DataBaseConfig extends HttpServlet {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/usersData";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static Connection createConnection(){
        Connection con = null;
        try{
            try{
                Class.forName(DRIVER);
            }
            catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connection to object: "+con);
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }


}
