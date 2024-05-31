package CollectionDependencyInjection;
import java.util.List;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
public class Student {
	
	private String name;
	private Address address;
	private List<Course> courses;
	
	
	public Student(String name, Address address, List<Course> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	public Student() {
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}
	
	

}
