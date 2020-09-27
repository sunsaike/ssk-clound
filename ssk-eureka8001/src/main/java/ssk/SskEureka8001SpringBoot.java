package ssk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SskEureka8001SpringBoot {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplication().run(SskEureka8001SpringBoot.class,args);
    }
}
