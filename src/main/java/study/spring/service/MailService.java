package study.spring.service;

import org.springframework.stereotype.Component;

@Component // This annotation tells Spring to create an instance of this class as a bean
public class MailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via email: " + message);
    }

    @Override
    public void saveMessage(String message) {
        System.out.println("Message saved in database: " + message);
    }
}
