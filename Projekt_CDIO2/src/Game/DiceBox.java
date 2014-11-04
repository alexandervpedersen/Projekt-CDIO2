package Game;

public class DiceBox {
		
		//Dice t1;
		//Dice t2;
		int numberOfDice = 2;
		Dice[] box  = new Dice[numberOfDice];
		
		public DiceBox(){
		this.box[0] = new Dice(); 
		this.box[1] = new Dice(); 
		}

		public int getDice(int dicenumber) {
			return box[dicenumber].getDice();
		}
		
		public void setDice(int dicenumber, int new_dicevalue) {
			box[dicenumber].setDice(new_dicevalue);
		}
		
		public int getDiceside(int dicenumber) {
			return box[dicenumber].getDiceside();
		}
		/**
		 * Bruges til at slå med terningerne
		 * @return 
		 */
		public void rollDice(){
			box[0].rollDice();
			box[1].rollDice();
		}
		
		public int getSum() {
			return (box[0].getDice() + box[1].getDice());
		}
		
		public void setDiceside(int dicenumber, int new_diceside){
			box[dicenumber].setDiceside(new_diceside);
		}
		
		public boolean CheckReroll() {
			if (box[0].getDice() + box[1].getDice() == 10)
				return true;
			else
				return false;
		}

		public String toString() {
			return ("The dicebox has the values " + box[0].rollDice() + " and " + box[1].rollDice());
		}
}
