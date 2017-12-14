package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HystricError implements SchedualServiceHi{

    @Override
    public String sayHi(String name) {
        return "你好"+name+"断路器起作用了";
    }
}
