package com.qf.spring_front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFrontApplication.class, args);
    }

}
