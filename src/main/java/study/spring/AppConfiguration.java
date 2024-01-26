package study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Properties;
import java.util.Random;

@Configuration // This annotation tells Spring that this class is a configuration class
@ComponentScan(basePackages = "study.spring") // This annotation tells Spring to scan for components in the study.spring package
//As default, Spring will scan the main package where the configuration class is located
//In this case it is study.spring
//Default behavior is enough most of the time, so no need to specify the basePackages
@PropertySource("classpath:application.properties")
public class AppConfiguration {

    //Environment is used to access the properties defined in application.properties
    // It also takes all the properties defined in the system environment variables
    @Autowired
    private Environment environment;
    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    public Properties properties() {

        Properties properties = new Properties();
        properties.setProperty("email", environment.getProperty("email"));
        properties.setProperty("phone", environment.getProperty("phone"));
        return properties;
    }

}
