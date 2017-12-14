package com.forezp.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hystrixError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hystrixError(String name){
        return "你好："+name+"断路器报错!";
    }

}
