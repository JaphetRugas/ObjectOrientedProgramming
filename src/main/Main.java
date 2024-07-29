package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		OOP First Part, showing Classes and Objects
//		Person p = new Person();
//		Person p2 = new Person(); 
//		
//		p.firstName = "Jade Japhet";
//		p.lastName = "Rugas";
//		p.sex = 'M';
//		p.age = 12; 
//		
//		p2.firstName = "Albert";
//		p2.lastName = "Shrek";
//		p2.sex = 'M';
//		p2.age = 100;
//		
//		System.out.println(p.firstName);
//		System.out.println(p.lastName);
//		System.out.println(p.sex);
//		System.out.println(p.age);
//		
//		System.out.println();
//		
//		System.out.println(p2.firstName);
//		System.out.println(p2.lastName);
//		System.out.println(p2.sex);
//		System.out.println(p2.age); 
		
		
//		OOP - Constructors
//		new Product("Jade", 12);
//		new Product("Jade", 12.0f);
//		
//		Person p1 = new Person("Jade", "Rugas", 'M', 12);
//		
//		System.out.println(p1.age);
		
//		OOP - Object Methods
//		Character ch = new Character("Zues", "I am a god", 10000, 10000, 999);
//		
//		ch.introduce();
//		ch.sayDialog();
//		ch.talkTo("Jade");
//		ch.talkCha(ch);
		
//		OOP - Encapsulation
		User user = new User(123);
		
		System.out.print("Enter Username: ");
		user.setUserName(s.nextLine());
		System.out.print("Enter First Name: ");
		user.setfName(s.nextLine());
		System.out.print("Enter Last Name: ");
		user.setlName(s.nextLine());
		
		System.out.println("User ID: " + user.getUserID());
		System.out.println("Username: " + user.getUserName());
		System.out.println("First Name: " + user.getfName());
		System.out.println("Last Name: " + user.getlName());
	}

}
