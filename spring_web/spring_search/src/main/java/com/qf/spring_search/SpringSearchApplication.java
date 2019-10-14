package com.qf.spring_search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
public class SpringSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSearchApplication.class, args);
    }

}
