package ssk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001Boot {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001Boot.class,args);
    }
}
