package com.example.airline_reservation_web.UserDao;

import com.example.airline_reservation_web.Config.DataBaseConfig;
import com.example.airline_reservation_web.Entity.Flight;

import java.io.PrintWriter;
import java.sql.*;

public class FlightDao  {
    Connection con = null;
    String SQL = "select * from flights WHERE flight_from=? AND flight_to=?;";


    public PreparedStatement st() throws SQLException {
        PreparedStatement preparedStatement = con.prepareStatement(SQL);
        return preparedStatement;
    }


    public ResultSet rs() throws SQLException{
     ResultSet rs = st().executeQuery();
     return rs;
    }

    public String getFlight(Flight flight) throws SQLException {
        String from = flight.getFrom();
        String to = flight.getTo();

        try{
            con = DataBaseConfig.createConnection();
            st().setString(1,from);
            st().setString(2,to);

            if(rs().next()){
                return "Table";
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return"Error";
    }
}
