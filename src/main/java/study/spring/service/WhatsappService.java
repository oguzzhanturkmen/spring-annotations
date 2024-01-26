package study.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to create an instance of this class as a bean
public class WhatsappService implements MessageService{
    @Value("${email}")
    private String email;
    @Value("${phone}")
    private String phone;

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent via Whatsapp: " + message);
    }

    @Override
    public void saveMessage(String message) {
        System.out.println("Message saved in Whatsapp: " + message);
    }

    public void printContacts() {
        System.out.println("Printing contacts...");
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);


    }
}


