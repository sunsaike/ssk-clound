package ssk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002Boot {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002Boot.class,args);
    }
}
