package Game;

public class Player {
	
	private String name;
	private Account account;
	
	public Player (String new_name, Account new_account) {
		this.name = new_name;
		this.account = new_account;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String new_name) {
		this.name = new_name;
	}
	
	public int getBalance() {
		return account.getBalance();
	}
	
	public void setBalance(int new_balance) {
		account.setBalance(new_balance);
	}
	
	public void addBalance(int add) {
		account.addBalance(add);
	}
	
	public String toString() {
		return ("The player " + name + "has the " + account.toString());
	}
}

