package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.Driver;

@RestController
public class Controller {
	
	@GetMapping("/getStudent")
	public List<Student> getStudent() throws Exception{
	
		/*
		 * String url = "jdbc:mysql://localhost:3306/test"; String uname = "root";
		 * String pass = "root";
		 */
		String query = "Select * from student";
		
		List<Student> student = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		DriverManager.registerDriver(new Driver());
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldemo","root","root");
		System.out.println("Connection established");
		PreparedStatement ps = con.prepareStatement("select * from student where srollno=?");
		System.out.println("Enter srollno ");
		int srollno =sc.nextInt();
		System.out.println("Enter sname");
		String sname =sc.next();
		System.out.println("Enter fees");
		int fees = sc.nextInt();
		System.out.println("Enter stream");
		String stream=sc.next();

		ps.setInt(1, srollno);
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.println(rs.getInt("srollno")+" "+rs.getString("sname")+"  "+rs.getInt("fees")+"  "+rs.getString("stream")); // taking data from database
		
		sc.close();
		return student;
}
	
	@PostMapping("insertStudent")
	public String insertStudent() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno of new Student");
	    int srollno = sc.nextInt();
		System.out.println("Enter name of new Student");
		String sname = sc.next();
		System.out.println("Enter college fees");
		int fees = sc.nextInt();
		System.out.println("Enter the stream of new student");
		String stream = sc.next();
		System.out.println("data provided");
		sc.close();
		
		String query = ("insert into student (srollno ,sname,fees,stream) values (?,?,?,?)");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldemo","root","root");
		System.out.println("Connection Establised");
		
		PreparedStatement statement = con.prepareStatement(query);
		
		statement.setInt(1, srollno);
		statement.setString(2, sname);
		statement.setInt(3, fees);
		statement.setString(4,stream);
		statement.executeUpdate();
	//	System.out.println(statement.toString());
		System.out.println("rows inserted into student");
		statement.close();
		con.close();
		return "Inserted into Student";
		
	}
	
}
