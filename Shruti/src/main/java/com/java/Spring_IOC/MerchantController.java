package com.java.Spring_IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {
	
	@Autowired
	@Qualifier("online")
	Customer customer = null;
	
	@Value("${merchantId.usa}")
	int merchantId;

	@RequestMapping("testIOCone")
	public String testingCalling() {
		System.out.println(merchantId);
		System.out.println(customer.customerId);
		//Customer cust = new Customer();
		return customer.getCustomerName();
	}

	
}
