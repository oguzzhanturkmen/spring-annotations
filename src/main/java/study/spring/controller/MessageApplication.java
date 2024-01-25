package study.spring.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.AppConfiguration;
import study.spring.domain.Message;
import study.spring.service.MailService;
import study.spring.service.MessageService;
import study.spring.service.WhatsappService;

import java.util.Arrays;

public class MessageApplication {
    public static void main(String[] args) {

        Message message = new Message();
        message.setMessage("Spring is fun!");
/*

        //Send message as email
        MailService mailService = new MailService();
        mailService.sendMessage(message.getMessage());
*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        MessageService service = context.getBean(MailService.class); // This is the same as the above commented code
        // Spring will create an instance of MailService and inject it into the service variable
        //No need for new MailService() anymore
        service.sendMessage(message.getMessage());

        MessageService service2 = context.getBean("mailService",MessageService.class);
        service2.saveMessage(message.getMessage());

        MessageService service3 = context.getBean(WhatsappService.class);
        service3.sendMessage(message.getMessage());

        MessageService service4 = context.getBean("whatsappService",MessageService.class);
        service4.saveMessage(message.getMessage());

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);
    }
}
