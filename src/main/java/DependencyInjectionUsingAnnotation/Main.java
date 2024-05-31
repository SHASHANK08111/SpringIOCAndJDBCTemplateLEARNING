package DependencyInjectionUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        School school = context.getBean(School.class);

        school.displayStudentInfo();
    }
}
