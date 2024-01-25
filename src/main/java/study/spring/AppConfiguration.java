package study.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation tells Spring that this class is a configuration class
@ComponentScan(basePackages = "study.spring") // This annotation tells Spring to scan for components in the study.spring package
//As default, Spring will scan the main package where the configuration class is located
//In this case it is study.spring
//Default behavior is enough most of the time, so no need to specify the basePackages
public class AppConfiguration {

}
