import java.util.Scanner;

public class GameMode {

	Logic l1 = new Logic();
	Logic l2 = new Logic();
	boolean running = true;
	Scanner newInput = new Scanner(System.in);
	String input = "";
	// String aiMove = "";
	// String aiMove2 = "";

	public void gameOne() {
		while (running == true) {

			System.out.println("Please enter Rock, Paper or Scissors. Enter Exit to Quit");
			input = newInput.nextLine();

			if (!(input.equalsIgnoreCase("exit"))) {
				l1.pastInput.add(input);
			}

			if (input.equalsIgnoreCase("Exit")) {
				running = false;
				break;
			}

			l1.setAiMove(l1.pickMove(l1.pastInput));

			System.out.println("Player Move: " + input);
			System.out.println("AI Move: " + l1.getAiMove());
			System.out.println(l1.score(input, l1.getAiMove()));

		}
		newInput.close();
		System.out.println("Bye");

	}

	public void gameTwo() {

		l1.setAiMove(l1.randomMove());
		l2.setAiMove(l2.randomMove());

		while (running == true) {

			l1.pastInput.add(l2.getAiMove());
			l2.pastInput.add(l1.getAiMove());

			l1.setAiMove(l1.pickMove(l1.pastInput));
			l2.setAiMove(l2.pickMove(l2.pastInput));

			System.out.println("AI One Move: " + l1.getAiMove());
			System.out.println("AI Two Move: " + l2.getAiMove());
			System.out.println(l1.score(l1.getAiMove(), l2.getAiMove()));

			System.out.println("Continue?");
			input = newInput.nextLine();
			if (input.equalsIgnoreCase("no")) {
				running = false;
				break;
			}

		}
		newInput.close();
		System.out.println("Bye");

	}

}
