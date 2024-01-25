package study.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import study.spring.repository.Repository;

@Component // This annotation tells Spring to create an instance of this class as a bean
public class MailService implements MessageService{
    @Autowired // This annotation tells Spring to inject an instance of Repository into this variable
    @Qualifier("dbRepository") // This annotation tells Spring to inject an instance of DbRepository into this variable
    private Repository repository;

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message via email: " + message);
    }

    @Override
    public void saveMessage(String message) {
        repository.saveMessage(message);
        System.out.println("Message saved in database: " + message);
    }
}
