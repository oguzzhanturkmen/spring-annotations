package study.spring.repository;

import org.springframework.stereotype.Component;

@Component
public class FileReposityory implements Repository{

        public void saveMessage(String message) {
            System.out.println("REPO FILE Message saved in file: " + message);
        }
}
