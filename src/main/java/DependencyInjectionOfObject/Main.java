package DependencyInjectionOfObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       
        ApplicationContext context = new ClassPathXmlApplicationContext("SchoolBean.xml");

        School school = (School) context.getBean("school");

        school.displayStudentInfo();
    }
}
