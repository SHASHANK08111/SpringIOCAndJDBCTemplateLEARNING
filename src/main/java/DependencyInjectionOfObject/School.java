package DependencyInjectionOfObject;

public class School {
	private int id;
    private Student student;

    public void setStudent(Integer id,Student student) {
    	this.id=id;
        this.student = student;
    }
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}



	public void displayStudentInfo() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

