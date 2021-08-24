package com.java.Spring_hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	Student ss; //= new Student(); // reference variable / instance / object
	
		@RequestMapping("jbk")
		public String callshow() {	
		 ss.show();
		return "method call success";
		
	}
	
	
}
