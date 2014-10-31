package Game;

public class Tile {
	
	private String tilemessage;
	private int tilereward;
	private String tilename;
	
	public Tile() {
		this.tilemessage = "0";
		this.tilereward = 0;
		this.tilename = "0";
	}
	
	public Tile(String new_tilemessage, int new_tilereward, String new_tilename) {
		this.tilemessage = new_tilemessage;
		this.tilereward = new_tilereward;
		this.tilename = new_tilename;
	}
	
	public String getTilemessage() {
		return tilemessage;
	}
	
	public int getTilereward() { 
		return tilereward;
	}
	
	public String getTilename() {
		return tilename;
	}
	
	public void setTilemessage(String new_tilemessage) {
		this.tilemessage = new_tilemessage;
	}
	
	public void setTilereward(int new_tilereward) {
		this.tilereward = new_tilereward;
	}
	
	public void setTilename(String new_tilename) {
		this.tilename = new_tilename;
	}
	
	public void setTile(String new_tilemessage, int new_tilereward, String new_tilename) {
		this.tilemessage = new_tilemessage;
		this.tilereward = new_tilereward;
		this.tilename = new_tilename;	
	}
	
	public String toString() {
		return (getTilename() + " gives the reward: " + getTilereward() + " and gives the message: " + getTilemessage());
	}

}
