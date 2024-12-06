package com.example.IOCdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IoCdemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(IoCdemoApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
