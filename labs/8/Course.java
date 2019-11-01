import java.util.*;

public class Course {
	private String courseName;
	private int numberOfStudents;
	ArrayList<String> students = new ArrayList<String>();
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
		numberOfStudents++;
	}
	
	public ArrayList<String> getStudents(){
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
		
}
