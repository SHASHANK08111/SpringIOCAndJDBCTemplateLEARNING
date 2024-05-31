package CollectionDependencyInjectionANNOTATION;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DependencyInjectionUsingAnnotation.Config;

public class Main {
	
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("CollectionBean.xml");
//	    Address address=context.getBean("Address",Address.class);
//	    System.out.println(address);
		
//		Course course1=context.getBean("Course1",Course.class);
//	    System.out.println(course1);
//	    Course course2=context.getBean("Course2",Course.class);
//	    System.out.println(course2);
//		
//		  Student student=context.getBean("Student",Student.class);
//		  System.out.println(student);
		
//		Exam exam=context.getBean("Exam",Exam.class);
//		System.out.println(exam);
//       ExamManager examManager=context.getBean("ExamManager",ExamManager.class);
//       examManager.displayStudentExams();
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
//		 Address address=context.getBean("address",Address.class);
//		 System.out.println(address);
		  
		 Student student=context.getBean("student",Student.class);
		 System.out.println(student);
	}
}
