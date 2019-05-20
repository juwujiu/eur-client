package com.demo.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Test01Application {

	public static void main(String[] args) {
		SpringApplication.run(Test01Application.class, args);
	}

}
