package ssk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
@EnableEurekaClient
//@MapperScan(basePackages = "ssk.user.mapper.UserMapper")
public class SskEureka8001SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SskEureka8001SpringBoot.class,args);
    }
}
