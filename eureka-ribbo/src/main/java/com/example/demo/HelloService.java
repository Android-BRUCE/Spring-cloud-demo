package com.example.demo;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: service-ribbon
 * @description:
 * @author: Brucezheng
 * @create: 2018-06-30 08:46
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    /**
     * 当对特定的服务的调用的不可用达到一个阀值（Hystric 是5秒20次） 断路器将会被打开。
     * 断路打开后，可用避免连锁故障，fallback方法可以直接返回一个固定值
     */
    /**
     * 在hiService方法上加上@HystrixCommand注解。该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
     *
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }

    /**
     * 熔断方法
     *
     * @param name
     * @return
     */
    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
