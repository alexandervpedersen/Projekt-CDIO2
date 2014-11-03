package Test;
import Game.Dice;
import Game.DiceBox;

public class Test_diceside {
	public static void main(String[] args) {
		
//		Dice t1;
//		Dice t2;
		DiceBox box = new DiceBox();
		
		box.rollDice();
		
		System.out.println(box.getDice(0));
		System.out.println(box.getDice(1));
		
		
	}
}
