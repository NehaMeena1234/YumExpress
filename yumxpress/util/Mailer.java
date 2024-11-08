/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.util;

//import java.net.Authenticator;
//import java.net.PasswordAuthentication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import yumxpress.pojo.CustomerPojo;
import yumxpress.pojo.OrderPojo;
import yumxpress.pojo.StaffPojo;
import yumxpress.pojo.UserProfile;

class MyAuthenticator extends Authenticator {

    private String username, password;

    public MyAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.username, this.password);
    }
}

public class Mailer {

    private static Properties prop;

    static {
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
    }

    public static void sendMail(Map<String, String> emailCredentials, StaffPojo staff) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("secKey");
        System.out.println("From send mail method: " + username + ", " + password);
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);

               try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(staff.getEmailId())
            );

            String emailSubject = "Staff Details";
            String emailBody = "Dear " + staff.getStaffName() + ",\n\n"
                + "I hope this email finds you well. I am writing to provide you with the necessary staff details as requested. Please find the information below:\n\n"
                + "Staff ID: " + staff.getStaffId() + "\n"
                + "Company Name: " + OwnerProfile.getCompanyName() + "\n"
                + "Email ID: " + staff.getEmailId() + "\n"
                + "Staff password: " + PasswordEncryption.getDecryptedPassword(staff.getPassword()) + "\n\n"
                + "These details are crucial for internal record-keeping and ensuring efficient communication within the organization.\n\n"
                + "Best regards,\n\n"
                + OwnerProfile.getOwnerName();

            message.setSubject(emailSubject);
            message.setText(emailBody);
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new MessagingException("Error in sending email: " + e.getMessage());
        }
    
}
    


    public static void sendMail(Map<String, String> emailCredentials, CustomerPojo customer) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("securityKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
          try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(customer.getEmailId())
            );
        String emailSubject = "Welcome to YumXpress App - Your Ultimate Food Ordering Companion!";

        String emailBody = "Dear " + customer.getCustomerName() + ",\n"
                
                + "\n"
                + "We are happy to have as our esteemed customer. Please find your account info:\n"
                + "\n"
                + "Customer ID: " + customer.getCustomerId() + "\n"
                + "Your Name: " + customer.getCustomerName() + "\n"
                + "Email ID(logind): " + customer.getEmailId() + "\n"
                + "Iniitial password: " + PasswordEncryption.getDecryptedPassword(customer.getPassword()) + "\n"
                + "\n"
                + "Happy Hunger!!!\n"
                + "Best regards,\n"
                + "\n"
                + "YumXpress!";

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
        } catch (MessagingException ex) {
            ex.printStackTrace();
            throw new MessagingException("Error in sending email: " + ex.getMessage());
        }
    
    }
     public static void sendMail(Map<String, String> emailCredentials, OrderPojo order) throws MessagingException {
         final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("secKey");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
         try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(UserProfile.getEmailId())
            );
        double taxRate=0.075;
        double taxAmt=order.getProductPrice()*taxRate;
        double billAmount=order.getProductPrice()+taxAmt;
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy");
        String orderDate=sdf.format(today);
        String emailSubject = "Order Confirmation Mail!";

        String emailBody = "Dear " + order.getCustomerName() + "\n";
        emailBody+="\nFollowing are your order details:\n";
        emailBody+="\nOrder Id:"+order.getOrderId()+"\n";
        emailBody+="\nProduct Name:"+order.getProductName()+"\n";
        emailBody+="\nCompany:"+order.getCompanyName()+"\n";
        emailBody+="\nCompany email:"+order.getCompanyEmailId()+"\n";
        emailBody+="\nProduct Price:"+order.getProductPrice()+"\n";
        emailBody+="\nTax Amt:"+taxAmt+"\n";
        emailBody+="\nBill Amt:"+billAmount+"\n";
        emailBody+="\nDelivery Staff Name:"+order.getDeliveryStaffName()+"\n";
        emailBody+="\nOTP:"+order.getOtp()+"\n";
        emailBody+="Please share this OTP with the delivery staff\n";
        emailBody+="\nOrder Date:"+orderDate+"\n";
        emailBody+="\nthank you for ordering!!\n\nHappy Hunger!";
        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);
          } catch (MessagingException e) {
            e.printStackTrace();
            throw new MessagingException("Error in sending email: " + e.getMessage());
        }
    
     }
//   public static void main(String[] args) throws MessagingException {
//        Map<String,String> str=new HashMap<>();
//        str.put("emailId", "colab.lnct.113@gmail.com"); 
//        str.put("securityKey", "ecab dcxm ijvd gxco");
//         StaffPojo staff=new StaffPojo();
//         staff.setEmailId("afrozaalam192@gmail.com");
//        Mailer.sendMail(str, staff);
//    }

}
