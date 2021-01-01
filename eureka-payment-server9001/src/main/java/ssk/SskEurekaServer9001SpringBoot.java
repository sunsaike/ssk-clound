package ssk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
@EnableEurekaClient
//@MapperScan(basePackages = "ssk.user.mapper.UserMapper")
public class SskEurekaServer9001SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SskEurekaServer9001SpringBoot.class,args);
    }
}
