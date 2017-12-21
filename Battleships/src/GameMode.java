import java.util.Random;
import java.util.Scanner;

public class GameMode {

	void playerOneSetUp(Player p, Board b) {
		boolean p1Placing = true;
		Scanner userInput = new Scanner(System.in);
		int x;
		int y;
		int shipsPlaced = 0;
		String facing;

		System.out.println("Player One Please Enter the place ment of your ships.");
		System.out.println("Ships are placed in this order: Two Patrol Boats, Two Battleships, "
				+ "\n One Submarine, One Destroyer and One Carrier");
		while (p1Placing) {

			System.out.println("Please enter x value");
			x = userInput.nextInt();
			System.out.println("Please enter y value");
			y = userInput.nextInt();
			System.out.println("Please choose which way you want the ship to face");
			facing = userInput.next();
			p.placingShips(b, shipsPlaced, x, y, facing);
			shipsPlaced++; //
			if (shipsPlaced == p.getShips().size()) {
				p1Placing = false;
			}
			userInput.close();

		}

	}

	void playerTwoSetUp(Player p, Board b) {
		boolean p2Placing = true;
		Scanner userInput = new Scanner(System.in);
		int x;
		int y;
		int shipsPlaced = 0;
		String facing;

		System.out.println("Player Two Please Enter the place ment of your ships.");
		System.out.println("Ships are placed in this order: Two Patrol Boats, Two Battleships, "
				+ "\n One Submarine, One Destroyer and One Carrier");
		while (p2Placing) {

			System.out.println("Please enter x value");
			x = userInput.nextInt();
			System.out.println("Please enter y value");
			y = userInput.nextInt();
			System.out.println("Please choose which way you want the ship to face");
			facing = userInput.next();
			p.placingShips(b, shipsPlaced, x, y, facing);
			shipsPlaced++; //
			if (shipsPlaced == p.getShips().size()) {
				p2Placing = false;
			}
			userInput.close();

		}

	}

	void twoVsTwo(Player p1, Player p2, Board b1, Board b2) {

		Scanner userInput = new Scanner(System.in);
		int x;
		int y;
		boolean running = true;

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
			if (p1.attack(b2.getBoard(), x, y) == false) {
				System.out.println("Your Attack Misses the Battle Field");
			}
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
		userInput.close();

	}

	void playerVsAI(Player p1, Player p2, Board b1, Board b2) {

		Scanner userInput = new Scanner(System.in);
		int x;
		int y;
		boolean running = true;
		Random rand = new Random();
		int xAI;
		int yAI;
		while (running) {

			xAI = rand.nextInt(12) + 1;
			yAI = rand.nextInt(12) + 1;

			System.out.println("Player One");
			b1.drawBoard();
			System.out.println("");
			System.out.println("AI");
			b2.drawBoard();

			System.out.println("PLayer One's Turn");
			System.out.println("Enter First Number");
			x = userInput.nextInt();
			System.out.println("Enter Second Number");
			y = userInput.nextInt();
			p1.attack(b2.getBoard(), x, y);
			if (p1.attack(b2.getBoard(), x, y) == false) {
				System.out.println("Your Attack Misses the Battle Field");
			}
			// p2.checkingStateOfShips(b2, p2);
			// p1.checkingStateOfShips(b1, p1);

			System.out.println("Player One");
			b1.drawBoard();
			System.out.println("");
			System.out.println("AI");
			b2.drawBoard();

			System.out.println("AI's Turn");
			System.out.println("Enter First Number");
			System.out.println("Enter Second Number");
			p2.attack(b1.getBoard(), xAI, yAI);
			// p2.checkingStateOfShips(b2, p2);
			// 1p1.checkingStateOfShips(b1, p1);
			p2.checkingStateOfShips(b2, p2);
			p1.checkingStateOfShips(b1, p1);

			if (p1.getShips().isEmpty() || p2.getShips().isEmpty()) {
				running = false;
			}

		}
		System.out.println("Game Over");
		userInput.close();

	}

	void AIVsAI(Player p1, Player p2, Board b1, Board b2) {

		int x;
		int y;
		boolean running = true;
		Random rand = new Random();
		int xAI;
		int yAI;
		while (running) {

			x = rand.nextInt(12) + 1;
			y = rand.nextInt(12) + 1;
			xAI = rand.nextInt(12) + 1;
			yAI = rand.nextInt(12) + 1;

			System.out.println("AI One");
			b1.drawBoard();
			System.out.println("");
			System.out.println("AI Two");
			b2.drawBoard();

			System.out.println("AI One's Turn");
			p1.attack(b2.getBoard(), x, y);
			if (p1.attack(b2.getBoard(), x, y) == false) {
				System.out.println("Your Attack Misses the Battle Field");
			}

			p2.checkingStateOfShips(b2, p2);
			p1.checkingStateOfShips(b1, p1);

			if (p1.getShips().isEmpty() || p2.getShips().isEmpty()) {
				running = false;
			}

			System.out.println("AI One");
			b1.drawBoard();
			System.out.println("");
			System.out.println("AI Two");
			b2.drawBoard();

			System.out.println("AI Two's Turn");

			p2.attack(b1.getBoard(), xAI, yAI);

			p2.checkingStateOfShips(b2, p2);
			p1.checkingStateOfShips(b1, p1);

			if (p1.getShips().isEmpty() || p2.getShips().isEmpty()) {
				running = false;
			}

		}
		System.out.println("Game Over");

	}

}