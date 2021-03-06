package com.forezp.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServiceHiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServiceHiApplication.class, args);
	}
	@Value("${server.port}")
	String prot;
	@RequestMapping("/hi")
	public String home(@RequestParam String name){
		return "你好："+name+" ，我的端口时:"+prot;
	}
}
