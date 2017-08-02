package battleship;

public class Ship {
	protected String type;
	protected int length;
	//int hits;
	//boolean isHit;
	public Ship(String type, int length) {
		this.type = type;
		this.length = length;
		//this.hits = hits;
		//this.isHit = isHit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
