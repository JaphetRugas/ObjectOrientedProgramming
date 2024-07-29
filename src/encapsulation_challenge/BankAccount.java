package encapsulation_challenge;

public class BankAccount {
	
	private double balance;
	
	// constructor to initialize the account with an initial balance
	public BankAccount(double initialBalance) {
		if (initialBalance >= 0) this.balance = initialBalance;
		else {
			System.out.println("Initial balance must be non-negative");
			this.balance = 0;
		}
	}
	
	// Public method to get the current balance
	public double getBalance() {
		return balance;
	}
	
	// Public method to deposit money
	public void deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			System.out.println("Deposited: " + amount);
		} 
		else {
			System.out.println("Deposit amount must be positive");
		}
	}
	
	// Public method to withdraw money
	public void withDraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		}
		else if(amount > balance) {
			System.out.println("Insufficient balance to withdraw: " + amount);
		}
		else {
			System.out.println("Withdrawal amount must be positive");
		}
	}
	
	// Public method to display current balance
	public void displayBalance() {
		System.out.println("Current Balance: " + balance);
	}
	
}
