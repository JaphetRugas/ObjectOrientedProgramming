package main;

public class Main {

	public static void main(String[] args) {

		Person p = new Person();
		Person p2 = new Person(); 
		
		p.firstName = "Jade Japhet";
		p.lastName = "Rugas";
		p.sex = 'M';
		p.age = 12; 
		
		p2.firstName = "Albert";
		p2.lastName = "Shrek";
		p2.sex = 'M';
		p2.age = 100;
		
		System.out.println(p.firstName);
		System.out.println(p.lastName);
		System.out.println(p.sex);
		System.out.println(p.age);
		
		System.out.println();
		
		System.out.println(p2.firstName);
		System.out.println(p2.lastName);
		System.out.println(p2.sex);
		System.out.println(p2.age);
		

	}

}
