package com.example.airline_reservation_web.JavaMail;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Mailer {

    public static void send(String name,String from, String subject, String message){
        final String reciver = "xxxxxxxxxx@xxxxxx";
        final String password = "xxxxxxxxxxxxxxx";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");//change accordingly
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props, new Authenticator(){
            protected PasswordAuthentication  getPasswordAuthentication(){
                return new PasswordAuthentication(reciver,password);
            }
        });

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(name));
            msg.addRecipient(Message.RecipientType.TO,new InternetAddress(from));
            msg.setSubject(subject);
            msg.setText(message);

            Transport.send(msg);
        }
        catch (MessagingException e ){
            throw new RuntimeException(e);

        }
    }

}
