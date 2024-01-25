package study.spring.repository;

import org.springframework.stereotype.Component;

@Component
public class DbRepository implements Repository{

    @Override
    public void saveMessage(String message) {
        System.out.println("REPO Message saved in database: " + message);
    }
}
