package com.example.airline_reservation_web.Config;


import java.sql.*;


public class DataBaseConfig {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/usersData";
    static final String USER = "root";
    static final String PASSWORD = "root";

    Connection conn;

    public DataBaseConfig(){
        connect();
    }

    public void connect(){
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException|ClassNotFoundException e) {
            System.out.println("Error!666");
            System.out.println(e.toString());
        }
    }

    public ResultSet rs(String q){
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(q);
            return rs;

        }catch (SQLException e){
            System.out.println("Error!querry error!!!");
            System.out.println(e.toString());
            return null;
        }
    }

    public int update(String query){
        try{
            Statement statement = conn.createStatement();
            return statement.executeUpdate(query);
        }catch(SQLException e){
            System.out.println("ERROR while executing update query");
            System.out.println(e.toString());
            return -1;
        }
    }



    public int delete(String query){
        try{
            Statement statement = conn.createStatement();
            return statement.executeUpdate(query);
        }catch(SQLException e){
            System.out.println("ERROR while deleting line!");
            System.out.println(e.toString());
            return -1;
        }
    }

    public void close(){
        try{
            conn.close();
        }catch(SQLException e){
            System.out.println("ERROR while closing connections!");
            System.out.println(e.toString());
        }
    }


}
