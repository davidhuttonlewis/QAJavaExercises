
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board b1 = new Board();
		Board b2 = new Board();
		Player p1 = new Player();
		Player p2 = new Player();
		GameMode g1 = new GameMode();

		b1.setupBoard();
		b2.setupBoard();

		p1.addShips();
		p2.addShips();

		// g1.playerOneSetUp(p1, b1);
		// g1.playerTwoSetUp(p2, b2);

		p1.testingPlacement(b1);
		p2.testingPlacement(b2);

		// g1.twoVsTwo(p1, p2, b1, b2);
		g1.playerVsAI(p1, p2, b1, b2);
		// g1.AIVsAI(p1, p2, b1, b2);

	}

}
