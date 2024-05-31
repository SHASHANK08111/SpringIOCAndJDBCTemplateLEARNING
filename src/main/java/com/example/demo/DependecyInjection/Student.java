package com.example.demo.DependecyInjection;

public class Student {
	
	private int id;
	private String studentName;//dependency of Student
	

	public Student() {
		System.out.println("Without Parameter Constructor");
	}
	public Student(int id, String studentName) {
		super();
		System.out.println("Student Constructor called");
		this.id = id;
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("SetId Method Called");
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("SetStudentName Method Called");
		this.studentName = studentName;
	}
    
	
	public void display() {
		System.out.println(id);
		System.out.println(studentName);
	}

}
