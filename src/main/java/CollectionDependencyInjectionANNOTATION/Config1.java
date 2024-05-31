package CollectionDependencyInjectionANNOTATION;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "CollectionDependencyInjectionANNOTATION",
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Course.class))
@PropertySource("classpath:application.properties")
public class Config1 {

	@Bean
	    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	        return new PropertySourcesPlaceholderConfigurer();
	    }
	
	@Bean(name="course1")
	public Course course1( @Value("${Course1.courseId}") int courseId,
			               @Value("${Course1.courseName}") String courseName,
			               @Value("${Course1.subjects}") String subjects
			) {
		Course course=new Course();
		course.setCourseId(courseId);
		course.setCourseName(courseName);
		course.setSubjects(Arrays.asList(subjects.split(",")));
		return course;
	}
	
	@Bean(name="course2")
	public Course course2( @Value("${Course2.courseId}") int courseId,
			               @Value("${Course2.courseName}") String courseName,
			               @Value("${Course2.subjects}") String subjects
			) {
		Course course=new Course();
		course.setCourseId(courseId);
		course.setCourseName(courseName);
		course.setSubjects(Arrays.asList(subjects.split(",")));
		return course;
	}
	
//	@Bean
//	public List<Course> courses(@Autowired @Qualifier("course1")Course course1,@Autowired @Qualifier("course2") Course course2) {
//	  return Arrays.asList(course1,course2);
//	}
	
}
