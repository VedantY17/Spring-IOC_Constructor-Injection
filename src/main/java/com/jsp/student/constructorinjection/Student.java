package com.jsp.student.constructorinjection;

public class Student {
	
	int id;
	String name;
	String email;
	
	
	Student(int id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void studentDetails() {
		System.out.println("ID of student: " + id);
		System.out.println("Name of student: " + name);
		System.out.println("Email of student: " + email);
	}

}
