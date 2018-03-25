
public class BankAccount {
	//Steven Banks
	
	private double balance;
	
	public BankAccount(double balance) {
		this.setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double depositAmount) {
		double newBalance = depositAmount + balance;
		balance = newBalance;
		return balance;
	}
	public double withdraw(double withdrawAmount) {
		double newBalance = balance - withdrawAmount;
		balance = newBalance;
		return balance;
	}
	
}
