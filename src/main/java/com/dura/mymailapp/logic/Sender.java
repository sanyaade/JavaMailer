package com.dura.mymailapp.logic;

import java.util.Date;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Sender {

    public boolean Send(String to, String subject, String message, String path) throws Throwable {
        boolean flag;
        message = message + "\n\n\n\n\n________________________________\n\nMailed By,\nRapid Mailer v0.5\nwww.harshadura.com";

        System.out.println(path);
        String from = "mailerjar@gmail.com";
        String pwd = "1100pass";
        String host = "smtp.gmail.com";
        java.util.Properties props = System.getProperties();
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        Session session = Session.getInstance(props, new com.dura.mymailapp.logic.Auth(from, pwd));
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(message);

            if (!path.equals("0")) {
                msg.setContent(addAttachment(path, message));
            }

            Transport.send(msg);
            System.out.println("Message has been successfully send to " + to);
            return (flag = true);
        } catch (Exception ee) {
            System.out.println("Error : " + ee.toString());
            return (flag = false);
        }
    }

    private Multipart addAttachment(String filename, String message) {
        try {
            Multipart multipart = new MimeMultipart();
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(message);
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            return multipart;
        } catch (Exception ee) {
            System.out.println("******" + ee.getMessage());
            return null;
        }
    }
}
