package encapsulation_challenge;

public class Main {

	public static void main(String[] args) {
		BankAccount bk = new BankAccount(10000);
		
		// Display initial balance
		bk.displayBalance();

		// Deposit amount
		bk.deposit(200);
		bk.displayBalance();
		 
		// Withdraw amount
		bk.withDraw(500);
		bk.displayBalance();
		
		// Withdraw more money than the current balance
		bk.withDraw(10000);
		bk.displayBalance();
		
		// Withdraw negative
		bk.withDraw(-10000);
		bk.displayBalance();
		
        // Attempt to deposit a negative amount
		bk.deposit(-1000);
		bk.displayBalance();
		
		

	}

}
