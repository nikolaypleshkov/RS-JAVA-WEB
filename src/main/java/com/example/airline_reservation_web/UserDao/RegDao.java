package com.example.airline_reservation_web.UserDao;

import com.example.airline_reservation_web.Config.DataBaseConfig;
import com.example.airline_reservation_web.Entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegDao {
    public String registerUser(User user){
        String first_name = user.getFirst_name();
        String last_name = user.getLast_name();
        String email = user.getEmail();
        String password = user.getPassword();
        String date = user.getDate_of_birth();

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try{
            con = DataBaseConfig.createConnection();
            String query = "INSERT INTO usersdata(user_f_name, user_l_name,user_email,user_pass,user_birth_date) VALUES (?,?,?,?,?)";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,first_name);
            preparedStatement.setString(2,last_name);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,password);
            preparedStatement.setString(5,date);

            int i = preparedStatement.executeUpdate();

            if(i != 0)
                return "registered!";

        }catch (SQLException e){
            e.printStackTrace();;
        }
        return "Error!";
    }
}
