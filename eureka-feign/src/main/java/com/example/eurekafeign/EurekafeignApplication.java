package com.example.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 后来注册在eureka-service上的client ， 需要过一段时间才能被发现
 * https://springcloud.cc/spring-cloud-brixton.html#_why_is_it_so_slow_to_register_a_service
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
public class EurekafeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekafeignApplication.class, args);
    }
}
