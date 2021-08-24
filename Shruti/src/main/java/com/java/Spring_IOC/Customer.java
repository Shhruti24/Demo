package com.java.Spring_IOC;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Customer {

	Customer(){
		System.out.println("I am in cust constructor");
	}

	int customerId;

	public String getCustomerName() {
		System.out.println("calling customer of jbk");;
		return "Calling customers of jbk through spring autowiring";

	}


}


