package com.example.airline_reservation_web.UserDao;

import com.example.airline_reservation_web.Config.DataBaseConfig;
import com.example.airline_reservation_web.Entity.User;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {

    public String loginUser(User user){
        String email = user.getEmail();
        String password = user.getPassword();

        Connection con = null;
        try{
            con = DataBaseConfig.createConnection();

            Statement st =con.createStatement();
            String SQL = "SELECT * FROM usersdata WHERE user_email = '"+email+"'AND user_pass = '"+password+"'";
            ResultSet rs = st.executeQuery(SQL);
            if(rs.next()){
                return "Login";
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return"Error";
    }

}
