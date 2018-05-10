package School;

import java.util.ArrayList;

public class FacultyMember extends Person {
	
	private String employID;
	private ArrayList<Course> courses = new ArrayList<Course>();
	private Person person;
	private FacultyMember falculty;
	
	public FacultyMember(String id, ArrayList<Course>courses, String name, Address address){
		this.employID = id;
		this.courses = courses;
		this.name =name;
		this.address = address;
	}
	
	public String getEmployID(){
		return employID;
	}
	
	public ArrayList getCourse(){
		return courses;
	}
	public void addCourse(Course course){
		courses.add(course);
	}
	
	public void revCourse(Course course){
		courses.remove(course);
	}
	public String toString (){
		return "Falculty: " +name+ " \nID: " +employID + " \nAddress: "  + address;
	}
}
