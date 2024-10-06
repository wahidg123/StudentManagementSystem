package studentApp;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String studentId;
	private List<String> courses;
	public Student(String name, int age, String studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		courses=new ArrayList<String>();
	}
	
	public void enrollCourse(String course) {
		courses.add(course);
	}
	public void printStudentInfo() {
		System.out.println("-------------Student Information-------------");
		System.out.println("Student Name: "+ name);
		System.out.println("Student Age: "+ age);
		System.out.println("Student Id: "+ studentId);
		System.out.println("Enrolled for: "+ courses);
	}
	
	
	
}



