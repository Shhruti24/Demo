package com.javabykiran.Shruti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.jdbc.Student;
import com.mysql.jdbc.Driver;

@RestController
public class SpringController {

	@RequestMapping("welcome")
	public List<String> show() {
		
		List<String> al = new ArrayList<String>();
		al.add("India");
		al.add("India");
		al.add("India");
		al.add("India");
		al.add("India");
		
		return al;
	}
	
	@PostMapping("mystring/{name}")
	public String getString(@PathVariable String name) {
		System.out.println(name);
		
		return "Success";
	}
		
	@PutMapping("mystring/{name}")
	public String putString(@PathVariable String name) {
		String oldname = "Monal";
		System.out.println("oldname :"+oldname);
		oldname = name;
		System.out.println("After update : "+oldname);
		return "Success";
	}

	/*@GetMapping("stulist")
	public ArrayList<Student> getStudent() {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1,"Shruti","114"));
		al.add(new Student(1,"Shruti","114"));
		al.add(new Student(1,"Shruti","114"));
		al.add(new Student(1,"Shruti","114"));
		al.add(new Student(1,"Shruti","114"));
		
		return al;*/
	
	/*@GetMapping("getStudent")
	public static void main(String[]args) throws Exception{
	
		String url = "jdbc:mysql://localhost:3306/mysqldemo";
		String uname = "root";
		String pass = "root";
		String query = "Select * FROM student";
		
		List<Student> student = new ArrayList<Student>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname,pass);
		System.out.println(2);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			int srollno = rs.getInt("Rollno");
			String sname = rs.getString("Name");
			int fees = rs.getInt("Fees");
			String stream = rs.getString("Stream");
			Student stu = new Student(srollno,sname,stream,fees);
			System.out.println(stu.toString());
			student.add(stu);
		}
		st.close();
		con.close();*/
	}


