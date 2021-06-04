package com.example.demo;

import com.example.demo.other_packet.Bikini;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo.other_packet")
@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(HelloSpringBootApplication.class, args);

		Bikini bikini = applicationContext.getBean(Bikini.class);
		System.out.println("Instance: " + bikini);

	}

}
