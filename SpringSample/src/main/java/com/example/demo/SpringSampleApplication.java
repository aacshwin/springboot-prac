package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringSampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringSampleApplication.class, args);
		
		Laptop lap1 = context.getBean(Laptop.class);
		lap1.switchON();
		
		System.out.println("Hello World. Welcome to boot !");
	}

}
