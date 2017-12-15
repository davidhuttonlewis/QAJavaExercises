
public class Treasure {

	private int xPosition;
	private int yPosition;

	public Treasure(int xPosition, int yPosition) {

		this.xPosition = xPosition;
		this.yPosition = yPosition;

	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public void addTreasureLocation(Moor moor) {

		moor.addTreasure(this.xPosition, this.yPosition);

	}

}
