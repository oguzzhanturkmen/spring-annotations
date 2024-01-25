package study.spring.service;

import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to create an instance of this class as a bean
public class WhatsappService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent via Whatsapp: " + message);
    }

    @Override
    public void saveMessage(String message) {
        System.out.println("Message saved in Whatsapp: " + message);
    }
}
