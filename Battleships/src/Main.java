import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board b1 = new Board();
		Board b2 = new Board();
		Player p1 = new Player();
		Player p2 = new Player();

		boolean running = true;

		Scanner userInput = new Scanner(System.in);
		int x;
		int y;

		b1.setupBoard();
		b2.setupBoard();

		p1.addShips();
		p2.addShips();

		p1.placingShips(b1);
		p2.placingShips(b2);
		// p1.attack(b2.getBoard(), 0, 2);
		// p2.attack(b1.getBoard(), 1, 0);
		// p1.attack(b1.getBoard(), 0, 0);

		// p1.checkingStateOfShips(b1);
		// System.out.println(p1.getShips().get(0).isDestroid());

		while (running) {

			System.out.println("Player One");
			b1.drawBoard();
			System.out.println("");
			System.out.println("Player Two");
			b2.drawBoard();

			System.out.println("PLayer One's Turn");
			System.out.println("Enter First Number");
			x = userInput.nextInt();
			System.out.println("Enter Second Number");
			y = userInput.nextInt();
			p1.attack(b2.getBoard(), x, y);
			p2.checkingStateOfShips(b2, p2);

			System.out.println("Player One");
			b1.drawBoard();
			System.out.println("");
			System.out.println("Player Two");
			b2.drawBoard();

			System.out.println("PLayer Two's Turn");
			System.out.println("Enter First Number");
			x = userInput.nextInt();
			System.out.println("Enter Second Number");
			y = userInput.nextInt();
			p2.attack(b1.getBoard(), x, y);

			p1.checkingStateOfShips(b1, p1);

			if (p1.getShips().isEmpty() || p2.getShips().isEmpty()) {
				running = false;
			}

		}
		System.out.println("Game Over");
	}

}
