package School;

public class Course {
	private String courseID;
	private String title;
	private String term;
	
	public Course(String courseID, String title, String term){
		this.courseID = courseID;
		this.title = title;
		this.term = term;
		
	}
	
	public String getCourseID(){
		return courseID;
	}
	public String getTitle(){
		return title;
	}
	public String getTerm(){
		return term;
	}
	public String toString(){
		return "Course ID: "+courseID + "\nSubject: " + title + "\nTerm: " +term;
	}
}
