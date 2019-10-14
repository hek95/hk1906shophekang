package com.qf.spring_goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@MapperScan("com.qf.dao")
@EnableFeignClients(basePackages = "com.qf.feign")
@EnableTransactionManagement
public class SpringGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGoodsApplication.class, args);
    }

}
