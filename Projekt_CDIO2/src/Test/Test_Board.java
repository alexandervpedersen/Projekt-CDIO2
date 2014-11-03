package Test;
import Game.Tile;
import Game.Board;

public class Test_Board {
	public static void main(String[] args) {
	
	String namearray[] = new String[11];
	String name1 = "Tower";
	String name2 = "Crater";
	String name3 = "Palace Gates";
	String name4 = "Cold Desert";
	String name5 = "Walled City";
	String name6 = "Monastary";
	String name7 = "Black Cave";
	String name8 = "Huts In The Mountain";
	String name9 = "The Werewall";
	String name10 = "The Pit";
	String name11 = "Goldmine";
	
	namearray[0] = name1;
	namearray[1] = name2;
	namearray[2] = name3;
	namearray[3] = name4;
	namearray[4] = name5;
	namearray[5] = name6;
	namearray[6] = name7;
	namearray[7] = name8;
	namearray[8] = name9;
	namearray[9] = name10;
	namearray[10] = name11;
	
	String messagearray[] = new String[11];
	String message1 = "bla1";
	String message2 = "bla2";
	String message3 = "bla3";
	String message4 = "bla4";
	String message5 = "bla5";
	String message6 = "bla6";
	String message7 = "bla7";
	String message8 = "bla8";
	String message9 = "bla9";
	String message10 = "bla10";
	String message11 = "bla11";
	
	messagearray[0] = message1;
	messagearray[1] = message2;
	messagearray[2] = message3;
	messagearray[3] = message4;
	messagearray[4] = message5;
	messagearray[5] = message6;
	messagearray[6] = message7;
	messagearray[7] = message8;
	messagearray[8] = message9;
	messagearray[9] = message10;
	messagearray[10] = message11;
	
	Tile tile1 = new Tile(namearray[0], messagearray[0], 250);
	Tile tile2 = new Tile(namearray[1], messagearray[1], -200);
	Tile tile3 = new Tile (namearray[2], messagearray[2], -100);
	Tile tile4 = new Tile(namearray[3], messagearray[3], -20);
	Tile tile5 = new Tile(namearray[4], messagearray[4], 180);
	Tile tile6 = new Tile(namearray[5], messagearray[5], 0);
	Tile tile7 = new Tile(namearray[6], messagearray[6], -70);
	Tile tile8 = new Tile(namearray[7], messagearray[7], -60);
	Tile tile9 = new Tile(namearray[8], messagearray[8], -80);
	Tile tile10 = new Tile(namearray[9], messagearray[9], -90);
	Tile tile11 = new Tile(namearray[10], messagearray[10], 650);
	
	Board board = new Board(tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10, tile11);
	
	for (int i=1; i<=11; i++) {
	System.out.println(board.toString(i));
	}
	}
}
