
public class Player extends Creature {

	public Player(int xPosition, int yPosition) {
		super(xPosition, yPosition);
	}

	private int playerMovement = 1;

	public int getPlayerMovement() {
		return playerMovement;
	}

	public void setPlayerMovement(int playerMovement) {
		this.playerMovement = playerMovement;
	}

	public double calDistance(Treasure treasure) {

		double x = (double) this.xPosition - (double) treasure.getxPosition();
		double y = (double) this.yPosition - (double) treasure.getyPosition();
		double x2 = x * x;
		double y2 = y * y;
		double total = x2 + y2;
		double sqrt = Math.sqrt(total);

		return Math.round(sqrt * 100.0) / 100.0;

	}

	public String lookAround(Treasure treasure) {

		String result = "";

		if (calDistance(treasure) > 3.0d) {

			result = "Grey foggy clouds float oppressively close to you";
		} else if (calDistance(treasure) <= 3.0d) {

			result = "You see a faint glow in the distance";
		} else if (calDistance(treasure) <= 2.0d) {

			result = "The glow has gotten brigther";
		} else if (calDistance(treasure) <= 1.0d) {

			result = "The glow is almost blinging just a little bit more to go";
		}

		return result;

	}

}
