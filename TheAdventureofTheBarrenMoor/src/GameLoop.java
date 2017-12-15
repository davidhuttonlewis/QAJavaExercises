import java.util.Scanner;

public class GameLoop {

	boolean running = true;
	private Scanner scanner = new Scanner(System.in);
	String playerInput = "";
	Moor m1 = new Moor();
	Player p1 = new Player(4, 6);
	Treasure t1 = new Treasure(7, 3);

	void gameSetup() {
		m1.setUpMoor();
		t1.addTreasureLocation(m1);

	}

	public void game() {

		System.out.println("You awaken in a barren moor. Please enter north, east, south and west to being moving. "
				+ "\n you can also use Look to look around");
		while (running) {
			playerInput = scanner.nextLine();

			if (playerInput.equalsIgnoreCase("look")) {

				System.out.println(p1.lookAround(t1));

			} else if (playerInput.equalsIgnoreCase("north") || playerInput.equalsIgnoreCase("south")
					|| playerInput.equalsIgnoreCase("east") || playerInput.equalsIgnoreCase("west")) {

				p1.movement(playerInput, m1, p1.getPlayerMovement());
				System.out.println("You are " + p1.calDistance(t1) + " meters away.");

				if (p1.calDistance(t1) == 0.0) {
					running = false;
				}
			} else {
				System.out.println("Not a vaild in put");
			}
		}
		scanner.close();
		System.out.println("Well done you've found the treasure");
	}

}
