package CollectionDependencyInjection;

import java.util.List;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
public class Course {
	private int courseId;
	private String courseName;
	private List<String> subjects;
	
	
	public Course(int courseId, String courseName, List<String> subjects) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.subjects = subjects;
	}
	
	public Course() {

	}


	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", subjects=" + subjects + "]";
	}
	
}
