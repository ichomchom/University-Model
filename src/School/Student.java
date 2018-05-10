package School;

import java.util.ArrayList;

public class Student extends Person {
	private String CIN;
	private ArrayList<Course> courses = new ArrayList<Course>();
	private Person person;
	private Student student;
	
	public Student(String id, ArrayList<Course> course, String name, Address address ){
		this.CIN = id;
		this.courses = course;
		this.name = name;
		this.address = address;
	}
	
	public String getStudentCIN(){
		return CIN;
	}
	public ArrayList<Course> getCourses(){
		return courses;
	}
	public void addCourse(Course course){
		courses.add(course);
	}
	
	public void revCourse(Course course){
		courses.remove(course);
	}
	public String toString(){
		return "Student: " +name+  " \nCIN: "  +CIN+ " \nAdress: " +address+" ";
	}
	
}
