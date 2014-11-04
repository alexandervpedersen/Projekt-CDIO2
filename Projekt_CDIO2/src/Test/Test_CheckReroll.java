package Test;
import Game.DiceBox;

public class Test_CheckReroll {
	public static void main(String[] args) {
		// Preconditions
		boolean testresult;
		DiceBox dicebox = new DiceBox();
		dicebox.setDice(0, 5);
		dicebox.setDice(1, 5);
		
		// Test
		testresult = dicebox.CheckReroll();
		
		// Postconditions
		if (testresult == true)
			System.out.println("OK");
		if (testresult == false)
			System.out.println("FEJL");
		
		// Preconditions
		dicebox.setDice(0, 6);
		dicebox.setDice(1, 7);
		
		// Test
		testresult = dicebox.CheckReroll();
		
		// Postconditions
		if (testresult == false)
			System.out.println("OK");
		if (testresult == true)
			System.out.println("FEJL");
		
		System.out.println(dicebox.toString());
		
	}

}
