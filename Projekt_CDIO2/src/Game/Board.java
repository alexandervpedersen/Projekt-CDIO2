package Game;

public class Board {	
	Tile tile1;
	Tile tile2;
	Tile tile3;
	Tile tile4;
	Tile tile5;
	Tile tile6;
	Tile tile7;
	Tile tile8;
	Tile tile9;
	Tile tile10;
	Tile tile11;	
	Tile board[];
	
	public Board(Tile tile1, Tile tile2, Tile tile3, Tile tile4, Tile tile5, Tile tile6, Tile tile7, Tile tile8, Tile tile9, Tile tile10, Tile tile11) {
		Tile board[] = new Tile[11];
		board[0] = this.tile1;
		board[1] = this.tile2;
		board[2] = this.tile3;
		board[3] = this.tile4;
		board[4] = this.tile5;
		board[5] = this.tile6;
		board[6] = this.tile7;
		board[7] = this.tile8;
		board[8] = this.tile9;
		board[9] = this.tile10;
		board[10] = this.tile11;
		
		this.tile1 = tile1;
		this.tile2 = tile2;
		this.tile3 = tile3;
		this.tile4 = tile4;
		this.tile5 = tile5;
		this.tile6 = tile6;
		this.tile7 = tile7;
		this.tile8 = tile8;
		this.tile9 = tile9;
		this.tile10 = tile10;
		this.tile11 = tile11;
	}
	
	public String getTilemessage(int tilenumber) {
		return board[tilenumber].getTilemessage();
	}
	
	public int getTilereward(int tilenumber) {
		return board[tilenumber].getTilereward();
	}
	
	public String getTilename(int tilenumber) {
		return board[tilenumber].getTilename();
	}
	
	public void setTilemessage(int tilenumber, String new_tilemessage) {
		board[tilenumber].setTilemessage(new_tilemessage);
	}
	
	public void setTilereward(int tilenumber, int new_tilereward) {
		board[tilenumber].setTilereward(new_tilereward);
	}
	
	public void setTilename(int tilenumber, String new_tilename){
		board[tilenumber].setTilename(new_tilename);
	}
	
	public String toString() {
		String n = "0";
		for (int i=0; i<=10; i++) {
		n = (board[i].toString() + "\n");
		}
		return n;
	}
}
