package com.java.Spring_IOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ShrutiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShrutiApplication.class, args);
	}
	@Bean("retail")
	Customer getCustObject() {
		System.out.println("explicitely bean is creating");
		Customer customer = new Customer();
		customer.customerId = 5667;
		return customer;
}
	@Bean("online")
	Customer getOnlineCustObject() {
	System.out.println("explicitely bean is OnlineCust");
	Customer customer = new Customer();
	customer.customerId = 91011;
	return customer;
}}