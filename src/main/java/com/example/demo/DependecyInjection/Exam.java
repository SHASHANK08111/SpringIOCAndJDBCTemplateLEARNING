package com.example.demo.DependecyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
		 
    public static void main(String[] args) {
		
//    	//using setter
//    	Student student1=new Student();
//   	student1.setId(1);
//    	student1.setStudentName("Raj");
//    	student1.display();
//    	//using constructor
//    	Student student2=new Student(1,"Raj");
//    	student2.display();
    	
    	
    	
    	//Spring dependency injection
    	ApplicationContext context=new ClassPathXmlApplicationContext("StudentBean.xml");
    	System.out.println("Object Using Setter For Dependency Injection");
    	Student student1=context.getBean("Student1",Student.class);
    	student1.display();
    	 
    	System.out.println("Object Using Constructor For Dependency Injection");
    	Student student2=context.getBean("Student2",Student.class);
    	student2.display();
	}
}
