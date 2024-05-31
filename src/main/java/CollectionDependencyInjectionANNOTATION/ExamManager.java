package CollectionDependencyInjectionANNOTATION;

import java.util.Map;

public class ExamManager {
	
    private Map<Student, Exam> studentExams;

    
    public ExamManager(Map<Student, Exam> studentExams) {
		super();
		this.studentExams = studentExams;
	}
	public ExamManager() {}


    public void setStudentExams(Map<Student, Exam> studentExams) {
        this.studentExams = studentExams;
    }

    public void displayStudentExams() {
        for (Map.Entry<Student, Exam> entry : studentExams.entrySet()) {
            Student student = entry.getKey();
            Exam exam = entry.getValue();
            System.out.println("Student: " + student + 
                    ", Subject: " + exam);
        }
    }
}
