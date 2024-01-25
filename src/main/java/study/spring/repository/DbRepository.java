package study.spring.repository;

public class DbRepository implements Repository{

    @Override
    public void saveMessage(String message) {
        System.out.println("Message saved in database: " + message);
    }
}
