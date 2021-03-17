package com.example.airline_reservation_web.JavaMail;

import com.mysql.cj.Session;

import java.util.Properties;


public class Mailer {
    private String reciver = "icelol@abv.bg";
    private String password = "645312niki";
    public static void send(String name,String from, String subjcet, String message){
        Properties props = new Properties();
        props.put("mail.smtp.host", "mail.abv.bg");//change accordingly
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props)
    }

}
