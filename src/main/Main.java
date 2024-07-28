package main;

public class Main {

	public static void main(String[] args) {
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
		
		new Product("Jade", 12);
		new Product("Jade", 12.0f);
		
		Person p1 = new Person("Jade", "Rugas", 'M', 12);
		
		System.out.println(p1.age);

	}

}
