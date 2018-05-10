package School;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

public class Driver {
	public static ArrayList<Course> courses;
	public static List<Course> newCourses;
	public static ArrayList<Student> students;
	public static ArrayList<FacultyMember> faculty;
	public static ArrayList<Person> person;

	public Driver(){
		courses  = new ArrayList<Course>();
		students = new ArrayList<Student>();
		faculty = new ArrayList<FacultyMember>();
		person = new ArrayList<Person>();
		newCourses = new ArrayList<Course>();
		}

	public static void main(String[] args) {
		courses  = new ArrayList<Course>();
		students = new ArrayList<Student>();
		faculty = new ArrayList<FacultyMember>();
		person = new ArrayList<Person>();
		Person person = new Person();
		newCourses = new ArrayList<Course>();
		
		String[]choices = {"Quit", "Student", "Faculty", "Course"};
		int choice;

		do{
			choice = JOptionPane.showOptionDialog(null, "Main Menu",
					"Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");
			switch(choice){
			case 0:
				break;
			case 1:
				student();
				break;
			case 2:
				faculty();
				break;
			case 3:
				course();
			
				break;
			}
		}while(choice!=0);


	}

	public static void student(){
		String[]choices = {"Quit", "Add Student", "Remove Student", "List Student","Add Course","Drop Course","List Course"};
		int choice;

		do{
			choice = JOptionPane.showOptionDialog(null, "Student Menu",
					"Student Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");
			switch(choice){
			case 0:
				break;
			case 1:
				studentInput();
				break;
			case 2:
				delStudent();
				break;
			case 3:
				getStudentInput();
				break;
			case 4:

				studentAddCourse();
				break;
			case 5:
				studentDropCourse();
				break;
			case 6:
				showCourse();
				
			}
		}while(choice!=0);
	}

	private static void showCourse() {
		int stdChoice = JOptionPane.showOptionDialog(null, "Choose A Student",
				"Choose A Student", 0, JOptionPane.QUESTION_MESSAGE, null,
				students.toArray(), "null"); 
		JOptionPane.showMessageDialog(null, students.get(stdChoice).getCourses());
		
	}

	public static void delStudent(){
		students.remove(getStudentInput());
	}
	public static void studentDropCourse(){
		int stdChoice = JOptionPane.showOptionDialog(null, "Choose A Student",
				"Choose A Student", 0, JOptionPane.QUESTION_MESSAGE, null,
				students.toArray(), "null"); 
		int courseChoice = JOptionPane.showOptionDialog(null, "Choose A Course",
				"Choose A Course", 0, JOptionPane.QUESTION_MESSAGE, null,
				courses.toArray(), "null");


		
		students.get(stdChoice).revCourse(courses.get(courseChoice));
	}

	public static void studentAddCourse(){
	
		int stdChoice = JOptionPane.showOptionDialog(null, "Choose A Student",
				"Choose A Student", 0, JOptionPane.QUESTION_MESSAGE, null,
				students.toArray(), "null"); 
		int courseChoice = JOptionPane.showOptionDialog(null, "Choose A Course",
				"Choose A Course", 0, JOptionPane.QUESTION_MESSAGE, null,
				courses.toArray(), "null");

		newCourses.add(courses.get(courseChoice));
	//	students.get(stdChoice).addCourse(newCourses.get(courseChoice));

				students.get(stdChoice).getCourses().add(newCourses.get(courseChoice));
				
		//		studentList.get(index).getCourseSchedule().add(courseList.get(index));


	}

	public static void studentInput(){
		String name = JOptionPane.showInputDialog(null, "Enter student's name: ","Students",JOptionPane.PLAIN_MESSAGE );
		String id = JOptionPane.showInputDialog(null, "Enter student's CIN: ","Students",JOptionPane.PLAIN_MESSAGE );
		String num = JOptionPane.showInputDialog(null, "Enter student's street number: ","Students",JOptionPane.PLAIN_MESSAGE );
		String streetName = JOptionPane.showInputDialog(null, "Enter student's street name: ","Students",JOptionPane.PLAIN_MESSAGE );
		String city = JOptionPane.showInputDialog(null, "Enter student's city: ","Students",JOptionPane.PLAIN_MESSAGE );
		String state = JOptionPane.showInputDialog(null, "Enter student's state: ","Students",JOptionPane.PLAIN_MESSAGE );
		Address adrs = new Address(num,streetName,city,state);
		Student std = new Student(id,courses, name,adrs );

		students.add(std);


	} 



	public static Student getStudentInput(){
		int choice = JOptionPane.showOptionDialog(null, "Choose A Student",
				"Choose A Student", 0, JOptionPane.QUESTION_MESSAGE, null,
				students.toArray(), "null"); 
		JOptionPane.showMessageDialog(null, students.get(choice));
		return students.get(choice);

	}

	public static void facultyInput(){
		String name = JOptionPane.showInputDialog(null, "Enter faculty's name: ","Faculty Members",JOptionPane.PLAIN_MESSAGE );
		String id = JOptionPane.showInputDialog(null, "Enter faculty's ID: ","Faculty Members",JOptionPane.PLAIN_MESSAGE );
		String num = JOptionPane.showInputDialog(null, "Enter faculty's street number: ","Faculty Member",JOptionPane.PLAIN_MESSAGE );
		String streetName = JOptionPane.showInputDialog(null, "Enter faculty's street name: ","Faculty Member",JOptionPane.PLAIN_MESSAGE );
		String city = JOptionPane.showInputDialog(null, "Enter faculty's city: ","Faculty Member",JOptionPane.PLAIN_MESSAGE );
		String state = JOptionPane.showInputDialog(null, "Enter faculty's state: ","Faculty Member",JOptionPane.PLAIN_MESSAGE );
		Address adrs = new Address(num,streetName,city,state);
		FacultyMember fac = new FacultyMember(id,courses, name,adrs );

		faculty.add( fac);
	}

	public static void faculty(){
		String[]choices = {"Quit", "Add Faculty", "Remove Faculty", "List Faculty","Assign Class", "Remove Class","List Course"};
		int choice;

		do{
			choice = JOptionPane.showOptionDialog(null, "Faculty Menu",
					"Faculty Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");
			switch(choice){
			case 0:
				break;
			case 1:
				facultyInput();
				break;
			case 2:
				delFaculty();
				break;
			case 3:
				getFacultyInput();
				break;
			case 4:
				facultyCourse();
				break;
			case 5:
				facAddCourse();
				break;
			case 6:
				facDropCourse();
				break;
			case 7:
				listCourse();
				break;
		}	
		}while(choice!=0);
	}

	private static void listCourse() {
		int choice = JOptionPane.showOptionDialog(null, "Choose A Student",
				"Choose A Student", 0, JOptionPane.QUESTION_MESSAGE, null,
				faculty.toArray(), "null"); 
		JOptionPane.showMessageDialog(null, faculty.get(choice).getClass());
		
	}

	private static void facultyCourse() {
		getFacultyInput();


	}
	public static void facDropCourse(){
		int facChoice = JOptionPane.showOptionDialog(null, "Choose A Member",
				"Choose A Member", 0, JOptionPane.QUESTION_MESSAGE, null,
				students.toArray(), "null"); 
		int courseChoice = JOptionPane.showOptionDialog(null, "Choose A Course",
				"Choose A Course", 0, JOptionPane.QUESTION_MESSAGE, null,
				courses.toArray(), "null");


		students.get(facChoice).revCourse(courses.get(courseChoice));
	}

	public static void facAddCourse(){

		int facChoice = JOptionPane.showOptionDialog(null, "Choose A Member",
				"Choose A Member", 0, JOptionPane.QUESTION_MESSAGE, null,
				students.toArray(), "null"); 
		int courseChoice = JOptionPane.showOptionDialog(null, "Choose A Course",
				"Choose A Course", 0, JOptionPane.QUESTION_MESSAGE, null,
				courses.toArray(), "null");

		students.get(facChoice).addCourse(courses.get(courseChoice));
	}

	public static void delFaculty(){
		faculty.remove(getFacultyInput());
	}
	public static FacultyMember getFacultyInput(){
		int choice = JOptionPane.showOptionDialog(null, "Choose A Member",
				"Choose A Member", 0, JOptionPane.QUESTION_MESSAGE, null,
				faculty.toArray(), "null"); 
		JOptionPane.showMessageDialog(null, faculty.get(choice));
		return faculty.get(choice);
	}

	public static void courseInput(){
		String id = JOptionPane.showInputDialog(null, "Enter course ID: ","Course",JOptionPane.PLAIN_MESSAGE );
		String title = JOptionPane.showInputDialog(null, "Enter course title: ","Course",JOptionPane.PLAIN_MESSAGE );
		String term = JOptionPane.showInputDialog(null, "Enter course term: ","Course",JOptionPane.PLAIN_MESSAGE );

		Course crs = new Course(id, title, term);

		courses.add(crs);
		
	
		
	}

	public static Course getCourseInput(){
		int choice = JOptionPane.showOptionDialog(null, "Choose A Course",
				"Choose A Course", 0, JOptionPane.QUESTION_MESSAGE, null,
				courses.toArray(), "null"); 
		JOptionPane.showMessageDialog(null, courses.get(choice));
		return courses.get(choice);
	}
	public static void course(){
		String[]choices = {"Quit", "Add Course", "Remove Course", "List Course"};
		int choice;

		do{
			choice = JOptionPane.showOptionDialog(null, "Course Menu",
					"Course Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");
			switch(choice){
			case 0:
				break;
			case 1:
				courseInput();
				break;
			case 2:
				delCourse();
				break;
			case 3:
				getCourseInput();
				break;
			}
		}while(choice!=0);
	}
	public static void delCourse(){
		courses.remove(getCourseInput());
	}

}
