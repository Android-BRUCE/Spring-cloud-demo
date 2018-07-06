package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: eureka-demo
 * @description:
 * @author: Brucezheng
 * @create: 2018-07-05 17:15
 **/
@SpringBootApplication
@EnableConfigServer
public class EurekaConfifServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfifServiceApplication.class, args);
    }
}
