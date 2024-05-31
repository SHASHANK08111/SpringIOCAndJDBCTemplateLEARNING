package JDBCTemplate;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {		
		 try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCTemplateConfig.class)){
			 Student student=context.getBean(Student.class);
			 StudentDao studentDao=context.getBean(StudentDao.class);
//			 int rowsAffected=studentDao.saveStudent(student);
//			 if(rowsAffected>0) {
//				 System.out.println("Data added");
//			 }else {
//				 System.out.println("Error");
//			 }
			 
//			 //Using ResultExtractor
//			  List<Student> allStudents = studentDao.getAllStudents();
//	          for (Student s : allStudents) {
//	              System.out.println(s);
//	          }
//	            
	          //Using RowMapper
//	          List<Student> allStudentsList = studentDao.getById();
//	          for (Student s : allStudentsList) {
//	              System.out.println(s);
//	          }
	          
//	          
//	          //Procedure
//	          System.out.println(studentDao.countStudents());
//	          
//	          //Function
//	          System.out.println( studentDao.getStudentNameById(1));
			 
			 studentDao.saveStudent(student);
	         
		 }
		 
		 
	
	}

}
