package com.example.eurekafeign;

import org.springframework.stereotype.Component;

/**
 * @program: eureka-demo
 * @description:
 * @author: Brucezheng
 * @create: 2018-07-05 15:54
 **/

/**
 * 断路调用的类必须要被注入到spring ioc容器中
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
