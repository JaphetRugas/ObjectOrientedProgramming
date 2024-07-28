package challenge_constructors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = s.nextInt();
		System.out.print("Enter num2: ");
		int num2 = s.nextInt(); 

		Calculator cal = new Calculator(num1, num2); 

		cal.sum(); 

        s.close();
	}
 

}
