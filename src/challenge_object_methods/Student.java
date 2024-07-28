package challenge_object_methods;

public class Student {
	

	String firstName, lastName, course, section, year; 
	float midtermGrade, finalGrade; 

	Student(String firstName, String lastName, String course, String section, String year, float midtermGrade,
			float finalGrade) { 
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.year = year;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
	} 
	
	void introductSelf() {
		System.out.println("Student Data: ");
		System.out.println("Full Name: " + firstName + " " + lastName);
		System.out.println("Course: " + course);
		System.out.println("Year Level: " + year);
		System.out.println("Section: " + section); 
		
	}
	
	void evaluateGrade() {
		float average = (midtermGrade + finalGrade) / 2;
		String remarks = "";
		
		if(average > 90) remarks = "Honor";
		else if(average > 80) remarks = "Honor";
		else remarks = "Failed";	
		
		System.out.println("Remarks: " + remarks);
	}
 

}
