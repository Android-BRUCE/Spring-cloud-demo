package com.example.eurekaserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: eureka-demo
 * @description: 配置的服务的注册中心
 * @author: Brucezheng
 * @create: 2018-07-06 14:48
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfigApplication.class, args);
    }
}
