package lab;

import java.util.ArrayList;

public class Student extends Person{
private String studentID;
private String status;
private ArrayList<Course> courses = new ArrayList<Course>();
private Person person;
private Student student;

public Student(String id, String status, ArrayList<Course> courses, String name, String phone, String email, Address address){
    this.studentID = id;
    this.status = status;
    this.courses = courses;
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.address = address;
}
public String getStudentID(){
    return studentID;
}
public String getStatus(){
    return status;
}
public ArrayList getCourses(){
    return courses;
}
public String toString(){
    return "Current Student: " + name + "\n" + studentID + "\n" + status + "\n" + address + "\n" + phone + "\n" + email;
}
}