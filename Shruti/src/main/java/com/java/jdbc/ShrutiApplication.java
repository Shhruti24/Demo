package com.java.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ShrutiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShrutiApplication.class, args);
		System.out.println("Started new project");
	}

}
