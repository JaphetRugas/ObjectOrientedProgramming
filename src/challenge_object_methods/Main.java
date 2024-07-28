package challenge_object_methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter fname: ");
		String fname = s.nextLine();
		System.out.print("Enter lname: ");
		String lname = s.nextLine();
		System.out.print("Enter Course: ");
		String course = s.nextLine();
		System.out.print("Enter Section: ");
		String section = s.nextLine();
		System.out.print("Enter Year Level: ");
		String year = s.nextLine();
		System.out.print("Enter Midterm Grade: ");
		float mgrade = s.nextFloat();
		System.out.print("Enter Final Grade: ");
		float fgrade = s.nextFloat();
		
		Student std = new Student(fname, lname, course, section, year, mgrade, fgrade);

		std.introductSelf();
		std.evaluateGrade();
	}

}
