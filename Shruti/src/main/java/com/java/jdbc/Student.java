package com.java.jdbc;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int srollno;
	String sname;
	String stream;
	int fees;
	
	public Student() {
		
	}

	public Student(int srollno, String sname, String stream, int fees) {
		super();
		this.srollno = srollno;
		this.sname = sname;
		this.stream = stream;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [srollno=" + srollno + ", sname=" + sname + ", stream=" + stream + ", fees=" + fees + "]";
	}
	public int getSrollno() {
		return srollno;
	}
	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public String getStudentName() {
		return null;
		
	}
	
}