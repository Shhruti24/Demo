package com.javabykiran.Shruti;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	
	@PostMapping("showallEmployee")
	public ArrayList<Employee>fetchAllEmployee(){
		
		ArrayList<Employee> al = new ArrayList<>();
		
		Employee emp = new Employee(1, "Sam","9987546767","IT","active","2021-08-14 00:00:00.0","Shruti","2021-08-13 00:00:00.0","Krishn", 1);
		Employee emp1 = new Employee(1, "Shayam","99898766767","IT","active","2021-08-12 00:00:00.0","Disha","2021-08-11 00:00:00.0","Kumar", 1);
		
		al.add(emp);
		al.add(emp1);
		
		return al;
	}
	
	
	
	

}
