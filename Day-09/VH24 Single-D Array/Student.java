package com.DAY9.SingleDimentionalDemo;

public class Student {
	
	//data members
	private int rollno;
	private String name;
	
	//para constructor
	
	public Student(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
