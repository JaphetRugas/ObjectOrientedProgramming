package challenge_constructors;

public class Calculator {
	
	int num1; 
	int num2;    
	
	Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	} 
	
	public void sum() {
		System.out.println(num1 + num2);
	}

}
