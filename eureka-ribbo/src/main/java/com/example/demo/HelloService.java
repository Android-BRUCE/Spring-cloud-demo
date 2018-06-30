package com.example.demo;

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

    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }
}
