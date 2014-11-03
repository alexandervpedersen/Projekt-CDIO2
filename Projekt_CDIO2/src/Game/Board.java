package Game;

public class Board {		
	Tile[] board = new Tile[11];
	
	public Board() {
		this.board[0] = new Tile();
		this.board[1] = new Tile();
		this.board[2] = new Tile();
		this.board[3] = new Tile();
		this.board[4] = new Tile();
		this.board[5] = new Tile();
		this.board[6] = new Tile();
		this.board[7] = new Tile();
		this.board[8] = new Tile();
		this.board[9] = new Tile();
		this.board[10] = new Tile();
	}
	
	public Board(Tile tile1, Tile tile2, Tile tile3, Tile tile4, Tile tile5, Tile tile6, Tile tile7, Tile tile8, Tile tile9, Tile tile10, Tile tile11) {
		this.board[0] = tile1;
		this.board[1] = tile2;
		this.board[2] = tile3;
		this.board[3] = tile4;
		this.board[4] = tile5;
		this.board[5] = tile6;
		this.board[6] = tile7;
		this.board[7] = tile8;
		this.board[8] = tile9;
		this.board[9] = tile10;
		this.board[10] = tile11;
	}
	
	public String getTilemessage(int tilenumber) {
		return board[tilenumber - 1].getTilemessage();
	}
	
	public int getTilereward(int tilenumber) {
		return board[tilenumber - 1].getTilereward();
	}
	
	public String getTilename(int tilenumber) {
		return board[tilenumber - 1].getTilename();
	}
	
	public void setTilemessage(int tilenumber, String new_tilemessage) {
		board[tilenumber - 1].setTilemessage(new_tilemessage);
	}
	
	public void setTilereward(int tilenumber, int new_tilereward) {
		board[tilenumber - 1].setTilereward(new_tilereward);
	}
	
	public void setTilename(int tilenumber, String new_tilename){
		board[tilenumber - 1].setTilename(new_tilename);
	}
	
	public String toString(int tilenumber) {
	return (board[tilenumber - 1].toString());
	}
}
