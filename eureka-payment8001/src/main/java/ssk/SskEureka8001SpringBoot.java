package ssk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SskEureka8001SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SskEureka8001SpringBoot.class,args);
    }
}
