package CollectionDependencyInjection;

public class Exam {
    private String subject;
    private int marks;

    
    public Exam(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}

	public Exam() {}
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", marks=" + marks + "]";
	}
 
}
