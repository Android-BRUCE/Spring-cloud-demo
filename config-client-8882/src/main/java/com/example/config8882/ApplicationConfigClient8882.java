package com.example.config8882;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eureka-demo
 * @description: 配置服务发现
 * @author: Brucezheng
 * @create: 2018-07-09 14:14
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class ApplicationConfigClient8882 {
    @Value("${foo}")
    String foo;
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigClient8882.class, args);
    }
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
