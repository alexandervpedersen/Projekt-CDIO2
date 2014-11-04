package Main;

import Game.Board;
import Game.Tile;
import Game.Dice;
import Game.DiceBox;
import Game.Player;
import Game.Account;
import boundaryToMatador.GUI;

public class Game {

	public static void main(String[] args) {
		GUI.create("fieldsfx.txt");
		
		// Creation of all Strings
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
		
		String message1 = "You have climbed up the tower and found a large chest filled with 250 gold coins!";
		String message2 = "You have fallen down a crater and dropped 200 gold coins!";
		String message3 = "You have reached the palace gates, you have to pay 100 gold coins!";
		String message4 = "You reached the cold desert and paid 20 gold coins for a jacket!";
		String message5 = "You have reached the walled city and recieved 180 gold coins for your courage!";
		String message6 = "You reached the monastery and found inner peace!";
		String message7 = "You spent a night in the black cave and woke up missing 70 gold coins!";
		String message8 = "You have been kidnapped by Jabba The Hut!" + "\n" + "You must pay 60 gold coins to be released from the mountains.";
		String message9 = "You have reached the werewolf wall, you paid 80 gold coins for a safe passage and an extra turn!";
		String message10 = "You were taken captive by an old wizard! Give him 90 gold coins or he will swing his stick in the pit!";
		String message11 = "You accidently fell down a mine shaft which turned out to be a gold mine! You mined gold for 650 gold coins.";
		
		String message_insertplayer1 = "Insert name of player 1";
		String message_insertplayer2 = "Insert name of player 2";
		String message_pretilereward = "Balance: ";
		
		String button_rolldice = "THROW";
		String message_everyturn = "Press " + button_rolldice + " to roll the dice";

		
		String namearray[] = new String[11];
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
		
		// Creation of all objects
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
		
		Account account1 = new Account(1000);
		Account account2 = new Account(1000);
		
		DiceBox dicebox = new DiceBox();
		
		Player player1 = new Player(GUI.getUserString(message_insertplayer1), account1);
		Player player2 = new Player(GUI.getUserString(message_insertplayer2), account2);
		
		// Sets GUI
		GUI.setDescriptionText(3, board.getTilemessage(1));
		GUI.setDescriptionText(4, board.getTilemessage(2));
		GUI.setDescriptionText(5, board.getTilemessage(3));
		GUI.setDescriptionText(6, board.getTilemessage(4));
		GUI.setDescriptionText(7, board.getTilemessage(5));
		GUI.setDescriptionText(8, board.getTilemessage(6));
		GUI.setDescriptionText(9, board.getTilemessage(7));
		GUI.setDescriptionText(10, board.getTilemessage(8));
		GUI.setDescriptionText(11, board.getTilemessage(9));
		GUI.setDescriptionText(12, board.getTilemessage(10));
		GUI.setDescriptionText(13, board.getTilemessage(11));
		
		GUI.setTitleText(3, board.getTilename(1));
		GUI.setTitleText(4, board.getTilename(2));
		GUI.setTitleText(5, board.getTilename(3));
		GUI.setTitleText(6, board.getTilename(4));
		GUI.setTitleText(7, board.getTilename(5));
		GUI.setTitleText(8, board.getTilename(6));
		GUI.setTitleText(9, board.getTilename(7));
		GUI.setTitleText(10, board.getTilename(8));
		GUI.setTitleText(11, board.getTilename(9));
		GUI.setTitleText(12, board.getTilename(10));
		GUI.setTitleText(13, board.getTilename(11));
		
		GUI.setSubText(3, message_pretilereward + board.getTilereward(1));
		GUI.setSubText(4, message_pretilereward + board.getTilereward(2));
		GUI.setSubText(5, message_pretilereward + board.getTilereward(3));
		GUI.setSubText(6, message_pretilereward + board.getTilereward(4));
		GUI.setSubText(7, message_pretilereward + board.getTilereward(5));
		GUI.setSubText(8, message_pretilereward + board.getTilereward(6));
		GUI.setSubText(9, message_pretilereward + board.getTilereward(7));
		GUI.setSubText(10, message_pretilereward + board.getTilereward(8));
		GUI.setSubText(11, message_pretilereward + board.getTilereward(9));
		GUI.setSubText(12, message_pretilereward + board.getTilereward(10));
		GUI.setSubText(13, message_pretilereward + board.getTilereward(11));
		
		GUI.addPlayer(player1.getName(), player1.getBalance(), 219, 68, 55);
		GUI.addPlayer(player2.getName(), player1.getBalance(), 49, 112, 206);
		GUI.setCar(1, player1.getName());
		GUI.setCar(1, player2.getName());
		
		boolean tur1 = false;
		boolean tur2 = false;
		
		// 
		int start = (int) ((Math.random() * 2) + 1);
		if (start == 1)
			tur1 = true;
		else
			tur2 = true;
		
		boolean winner = false;
		while (winner != true) {
			GUI.removeAllCars(player1.getName());
			GUI.removeAllCars(player2.getName());
			if (tur1 = true) {
				GUI.getUserButtonPressed(message_everyturn, button_rolldice);
				dicebox.rollDice();
				GUI.setDice(dicebox.getDice(0), dicebox.getDice(1));
				
				int n = dicebox.getSum();
				switch (n) {
				case 2: 
					player1.addBalance(board.getTilereward(1));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(3, player1.getName());
					GUI.showMessage(board.getTilemessage(1));
					break;
				case 3: 
					player1.addBalance(board.getTilereward(2));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(4, player1.getName());
					GUI.showMessage(board.getTilemessage(2));
					break;
				case 4: 
					player1.addBalance(board.getTilereward(3));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(5, player1.getName());
					GUI.showMessage(board.getTilemessage(3));
					break;
				case 5: 
					player1.addBalance(board.getTilereward(4));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(6, player1.getName());
					GUI.showMessage(board.getTilemessage(4));
					break;
				case 6: 
					player1.addBalance(board.getTilereward(5));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(7, player1.getName());
					GUI.showMessage(board.getTilemessage(5));
					break;
				case 7: 
					player1.addBalance(board.getTilereward(6));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(8, player1.getName());
					GUI.showMessage(board.getTilemessage(6));
					break;
				case 8: 
					player1.addBalance(board.getTilereward(7));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(9, player1.getName());
					GUI.showMessage(board.getTilemessage(7));
					break;
				case 9: 
					player1.addBalance(board.getTilereward(8));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(10, player1.getName());
					GUI.showMessage(board.getTilemessage(8));
					break;
				case 10: 
					player1.addBalance(board.getTilereward(9));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(11, player1.getName());
					GUI.showMessage(board.getTilemessage(9));
					break;
				case 11: 
					player1.addBalance(board.getTilereward(10));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(12, player1.getName());
					GUI.showMessage(board.getTilemessage(10));
					break;
				case 12: 
					player1.addBalance(board.getTilereward(11));
					GUI.removeCar(1, player1.getName());
					GUI.setCar(13, player1.getName());
					GUI.showMessage(board.getTilemessage(11));
					break;
				}
				GUI.setBalance(player1.getName(), player1.getBalance());
				
				if (dicebox.CheckReroll() == true) {
					tur1 = true;
					tur2 = false;
				}
				else {
					tur1 = false;
					tur2 = true;
				}
				
				if (player1.CheckWin() == true) {
						tur1 = false;
						tur2 = false;
						winner = true;
				}
				else {
						tur1 = false;
						tur2 = true;
						winner = false;
				}
			}
			if (tur2 = true) {
				GUI.getUserButtonPressed(message_everyturn, button_rolldice);
				dicebox.rollDice();
				GUI.setDice(dicebox.getDice(0), dicebox.getDice(1));
				
				int n = dicebox.getSum();
				switch (n) {
				case 2: 
					player2.addBalance(board.getTilereward(1));
					GUI.setCar(3, board.getTilename(1));
					GUI.showMessage(board.getTilemessage(1));
					break;
				case 3: 
					player2.addBalance(board.getTilereward(2));
					GUI.setCar(4, board.getTilename(2));
					GUI.showMessage(board.getTilemessage(2));
					break;
				case 4: 
					player2.addBalance(board.getTilereward(3));
					GUI.setCar(5, board.getTilename(3));
					GUI.showMessage(board.getTilemessage(3));
					break;
				case 5: 
					player2.addBalance(board.getTilereward(4));
					GUI.setCar(6, board.getTilename(4));
					GUI.showMessage(board.getTilemessage(4));
					break;
				case 6: 
					player2.addBalance(board.getTilereward(5));
					GUI.setCar(7, board.getTilename(5));
					GUI.showMessage(board.getTilemessage(5));
					break;
				case 7: 
					player2.addBalance(board.getTilereward(6));
					GUI.setCar(8, board.getTilename(6));
					GUI.showMessage(board.getTilemessage(6));
					break;
				case 8: 
					player2.addBalance(board.getTilereward(7));
					GUI.setCar(9, board.getTilename(7));
					GUI.showMessage(board.getTilemessage(7));
					break;
				case 9: 
					player2.addBalance(board.getTilereward(8));
					GUI.setCar(10, board.getTilename(8));
					GUI.showMessage(board.getTilemessage(8));
					break;
				case 10: 
					player2.addBalance(board.getTilereward(9));
					GUI.setCar(11, board.getTilename(9));
					GUI.showMessage(board.getTilemessage(9));
					break;
				case 11: 
					player2.addBalance(board.getTilereward(10));
					GUI.setCar(12, board.getTilename(10));
					GUI.showMessage(board.getTilemessage(10));
					break;
				case 12: 
					player2.addBalance(board.getTilereward(11));
					GUI.setCar(13, board.getTilename(11));
					GUI.showMessage(board.getTilemessage(11));
					break;
				}
				GUI.setBalance(player2.getName(), player2.getBalance());
				
				if (dicebox.CheckReroll() == true) {
					tur2 = true;
					tur1 = false;
				}
				else {
					tur2 = false;
					tur1 = true;
				}
				
				if (player1.CheckWin() == true) {
						tur2 = false;
						tur1 = false;
						winner = true;
				}
				else {
						tur2 = false;
						tur1 = true;
						winner = false;
				}
			}
		}
		
		
		
	}

}
