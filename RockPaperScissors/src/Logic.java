import java.util.ArrayList;
import java.util.Random;

public class Logic {

	private String move = "";
	private int playerScore = 0;
	private int AIScore = 0;
	private String aiMove = "";
	public ArrayList<String> pastInput = new ArrayList<String>();

	public String getAiMove() {
		return aiMove;
	}

	public void setAiMove(String aiMove) {
		this.aiMove = aiMove;
	}

	public String pickMove(ArrayList<String> s) {

		int rockCount = 0;
		int paperCount = 0;
		int scissorsCount = 0;

		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).equalsIgnoreCase("rock")) {
				rockCount++;
			}
			if (s.get(i).equalsIgnoreCase("paper")) {
				paperCount++;
			}
			if (s.get(i).equalsIgnoreCase("scissors")) {
				scissorsCount++;
			}

		}

		if (rockCount > paperCount && rockCount > scissorsCount) {
			move = "paper";
		} else if (paperCount > rockCount && paperCount > scissorsCount) {
			move = "scissors";
		} else if (scissorsCount > rockCount && scissorsCount > paperCount) {
			move = "rock";
		}

		return move;
	}

	public String score(String playerMove, String aiMove) {

		if (playerMove.equalsIgnoreCase("rock") && aiMove.equalsIgnoreCase("scissors")) {
			playerScore++;
		} else if (playerMove.equalsIgnoreCase("scissors") && aiMove.equalsIgnoreCase("rock")) {
			AIScore++;
		} else if (playerMove.equalsIgnoreCase("paper") && aiMove.equalsIgnoreCase("scissors")) {
			playerScore++;
		} else if (playerMove.equalsIgnoreCase("scissors") && aiMove.equalsIgnoreCase("paper")) {
			playerScore++;
		} else if (playerMove.equalsIgnoreCase("paper") && aiMove.equalsIgnoreCase("rock")) {
			playerScore++;
		} else if (playerMove.equalsIgnoreCase("rock") && aiMove.equalsIgnoreCase("paper")) {
			AIScore++;
		} else {
			// draw
		}

		return "Player One Score: " + playerScore + "\nPlayer Two Score: " + AIScore;
	}

	public String randomMove() {
		Random rand = new Random();
		int n = rand.nextInt(3) + 1;
		String move = "";

		switch (n) {
		case 1:
			move += "rock";
			break;
		case 2:
			move += "paper";
			break;
		case 3:
			move += "scissors";
			break;
		}
		return move;
	}

}
