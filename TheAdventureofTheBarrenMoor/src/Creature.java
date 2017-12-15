
public class Creature {

	protected int xPosition;
	protected int yPosition;

	public Creature(int xPosition, int yPosition) {

		this.xPosition = xPosition;
		this.yPosition = yPosition;

	}

	public void movement(String direction, Moor moor, int movement) {

		moor.removePlayer(this.xPosition, this.yPosition);

		if (direction.equalsIgnoreCase("north")) {
			this.xPosition -= movement;
			if (this.xPosition < 0) {
				System.out.println("You can't go that way");
				this.xPosition = 0;
			} else {
				System.out.println("You have moved one meter " + direction);
			}

		} else if (direction.equalsIgnoreCase("south")) {
			this.xPosition += movement;
			if (this.xPosition > 9) {
				System.out.println("You can't go that way");
				this.xPosition = 9;
			} else {
				System.out.println("You have moved one meter " + direction);
			}
		} else if (direction.equalsIgnoreCase("east")) {
			this.yPosition -= movement;
			if (this.yPosition < 0) {
				System.out.println("You can't go that way");
				this.yPosition = 0;
			} else {
				System.out.println("You have moved one meter " + direction);
			}
		} else if (direction.equalsIgnoreCase("west")) {
			this.yPosition += movement;
			if (this.yPosition > 9) {
				System.out.println("You can't go that way");
				this.yPosition = 9;
			} else {
				System.out.println("You have moved one meter " + direction);
			}
		}

		moor.addPlayer(this.xPosition, this.yPosition);
	}

}
