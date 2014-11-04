package Test;
import Game.Account;
import Game.Player;

public class Test_CheckWin {
	public static void main(String[] args) {
		// Precondition
		boolean testresult;
		Account acc = new Account(1000);
		Player player = new Player("Jon", acc);
		player.setBalance(3000);
		
		// Test
		testresult = player.CheckWin();
		
		// Postconditions
		if (testresult == true)
			System.out.println("OK");
		if (testresult == false)
			System.out.println("FEJL");
		
		// Preconditions
		player.setBalance(4000);
		
		// Test
		testresult = player.CheckWin();
		
		// Postconditions
		if (testresult == true)
			System.out.println("OK");
		if (testresult == false)
			System.out.println("FEJL");
		
		// Preconditions
		player.setBalance(2000);
		
		// Test
		testresult = player.CheckWin();
		
		// Postconditions
		if (testresult == false)
			System.out.println("OK");
		if (testresult == true)
			System.out.println("FEJL");
		
		System.out.println(player.toString());
	}
}
