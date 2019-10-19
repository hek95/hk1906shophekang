package com.qf.shop_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
//何康加了一句话
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableConfigServer
public class ShopConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopConfigApplication.class, args);
    }

}
