package lab;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Driver {
public static ArrayList<Person> students;
public static ArrayList<Course> courses;
public static ArrayList<FacultyMember> faculty;
static Scanner in;
public static int x;


public Driver()
{
    students = new ArrayList<Person>();
    courses = new ArrayList<Course>();
    faculty = new ArrayList<FacultyMember>();
}
public static void input(){
    String response = JOptionPane.showInputDialog(null, "Please enter your name: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response2 = JOptionPane.showInputDialog(null, "Please enter your phone number: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response3 = JOptionPane.showInputDialog(null, "Please enter your email: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response4 = JOptionPane.showInputDialog(null, "Please enter your street number: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response5 = JOptionPane.showInputDialog(null, "Please enter your street name: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response6 = JOptionPane.showInputDialog(null, "Please enter your city: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response7 = JOptionPane.showInputDialog(null, "Please enter your state: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response8 = JOptionPane.showInputDialog(null, "Please enter your postal code: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response9 = JOptionPane.showInputDialog(null, "Please enter your student ID: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response10 = JOptionPane.showInputDialog(null, "Please enter your student status: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    Address anAddress = new Address(response4, response5, response6, response7, response8);
    Student aStudent = new Student(response9, response10, courses, response, response2, response3, anAddress);
    students.add(aStudent);
    JOptionPane.showMessageDialog(null, students.get(students.size()-1).toString());
}
public static void courseInput(){
    FacultyMember instructor = null;
    in = new Scanner(System.in);
    String response = JOptionPane.showInputDialog(null, "Please enter the course identifier: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response2 = JOptionPane.showInputDialog(null, "Please enter course title: ", "A Request", JOptionPane.PLAIN_MESSAGE);
    String response3 = JOptionPane.showInputDialog(null, "Please enter course term: ", "A Request", JOptionPane.PLAIN_MESSAGE);
}
public static void main(String[] args) {
    students = new ArrayList<Person>();
    courses = new ArrayList<Course>();
    faculty = new ArrayList<FacultyMember>();
    Person[] choices = new Person[students.size()];//declare an array to use in drop down menu
    Object[] options1 = {"Quit", "Students", "Faculty", "Courses"};
    Object[] options2 = {"Go Back", "Add a Student", "Expel a Student", "Show Students"};
    Object[] options3 = {"Go Back", "Add an Instructor", "Delete an Instructor", "Show Instructors"};
    Object[] options4 = {"Go Back", "Create a Course", "Remove a Course", "View Courses"};
    int n = 0;
    do{//outer loop
        n = JOptionPane.showOptionDialog(null, "Welcome to CSULA, please select an option:", "Main Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[0]);
        if(n != 0){
            if(n == 1){//student loop
                int o = JOptionPane.showOptionDialog(null, "What would you like to do?", "Students", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
                    if(n != 0){
                        if(o == 1){//add a student
                            input();
                        }
                        else if(o == 2){//expel a student
                            students.toArray(choices);
                            JOptionPane.showMessageDialog(null, choices[0]);
                            String input = (String) JOptionPane.showInputDialog(null, "Choose a student: ", "Expel", JOptionPane.QUESTION_MESSAGE,null, choices,choices[0]);



                            }
                      }
                        else if(o == 3){//Show students - go to drop down menu
                            for(int i = 0; i<students.size(); i++){
                                JOptionPane.showMessageDialog(null, students.get(i).toString());
                            }
                        }
                    }   
            }
            if(n == 2){//faculty loop
                int o = JOptionPane.showOptionDialog(null, "What would you like to do?", "Instructors", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]);
                if(n != 0){
                    if(o == 1){//add instructor
                        input();
                    }
                    else if(o == 2){//fire instructor
                    }
                    else if(o == 3){//show instructor (via drop down menu)
                    }
                }
            }
            if(n == 3){//course loop
                int o = JOptionPane.showOptionDialog(null, "What would you like to do?", "Courses", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options4, options4[0]);
                if(n != 0){
                    if(o == 1){//add a course
                    }
                    else if(o == 2){//remove a course
                    }
                    else if(o == 3){//Show courses
                    }
                }
            }
            else if(n == 0){//quit program
            }

    }while(n != 0);
}
}