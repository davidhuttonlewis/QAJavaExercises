import java.util.ArrayList;

public class Ship {
	private int shipSize = 0;
	private int partsPlaced = 0;
	private ArrayList<Integer> xCords = new ArrayList<>();
	private ArrayList<Integer> yCords = new ArrayList<>();
	private boolean destroid = false;
	private String type;

	public Ship(String type) {

		this.type = type;

		if (this.type.equals("patrol")) {
			shipSize = 2;
		}
		if (this.type.equals("battleship")) {
			shipSize = 3;
		}
		if (this.type.equals("submarine")) {
			shipSize = 3;
		}
		if (this.type.equals("destroyer")) {
			shipSize = 4;
		}
		if (this.type.equals("carrier")) {
			shipSize = 5;
		}

	}

	public int getShipSize() {
		return shipSize;
	}

	public boolean isDestroid() {
		return destroid;
	}

	public String[][] placeShip(String[][] board, int x, int y, String p) {

		if (partsPlaced < shipSize && board[x][y] != "[ O ]") {

			board[x][y] = "[ O ]";

			for (int i = 0; i < shipSize; i++) {
				if (p.equalsIgnoreCase("n")) {
					board[x - 1][y] = "[ O ]";
				}
				if (p.equalsIgnoreCase("s")) {
					board[x + 1][y] = "[ O ]";
				}
				if (p.equalsIgnoreCase("e")) {
					board[x][y + 1] = "[ O ]";
				}
				if (p.equalsIgnoreCase("w")) {
					board[x][y - 1] = "[ O ]";
				}
			}
			xCords.add(x);
			yCords.add(y);
			partsPlaced++;
		}
		if (board[x][y] == "[ O ]") {
			// System.out.println("Can not place a part in an already occupied space");
		}
		if (partsPlaced == shipSize) {
			// System.out.println("All Parts Place");
		}

		return board;

	}

	public boolean checkShipState(String[][] board) {

		for (int i = 0; i < partsPlaced; i++) {

			if (board[xCords.get(i)][yCords.get(i)] == "[ X ]") {

				shipSize--;
				if (shipSize == 0) {

					destroid = true;

				}

			}

		}

		return destroid;

	}

}
