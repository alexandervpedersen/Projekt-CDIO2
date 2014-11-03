package Game;

public class Account {
		
	private int balance;
	
	public Account() {
		this.balance = 0;
	}
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		if (balance < 0)
			balance = 0;
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void addBalance(int add) {
		if (balance < 0)
			this.balance = add;
		else
			this.balance = this.balance + add;
	}
	
	public boolean CheckWin() {
		if (balance >= 3000)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return ("current balance: " + getBalance());
	}
}
