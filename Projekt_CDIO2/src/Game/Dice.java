package Game;

public class Dice {

		private int dice;
		private int diceside = 6;
		
		public Dice() {
			super();
		}
		public int getDice() {
			return dice;
		}

		public void setDice(int dice) {
			this.dice = dice;
		}
		
		public int getDiceside() {
			return diceside;
		}
		
		public void setDiceside(int new_diceside) {
			this.diceside = new_diceside;
		}
		
		public int rollDice(){
			dice = (int) (Math.random()* diceside + 1);
			return dice;
		}
		
		public String toString() {
			return ("The dice with " + diceside + " sides, has the current value of: " + dice); 
		}
}
