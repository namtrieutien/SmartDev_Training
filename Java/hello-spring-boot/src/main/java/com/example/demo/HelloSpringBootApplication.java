package com.example.demo;

import com.example.demo.other_packet.Bikini;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.example.demo.other_packet")
@ComponentScan("com.example.demo")

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(HelloSpringBootApplication.class, args);

		Dress dress1 = applicationContext.getBean(Dress.class);
		Dress dress2 = applicationContext.getBean(Dress.class);

		System.out.println("Dress 1: " + dress1);
		System.out.println("Dress 2: " + dress2);
	}

}
