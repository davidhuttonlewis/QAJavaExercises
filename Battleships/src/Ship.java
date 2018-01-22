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
			this.shipSize = 2;
		}
		if (this.type.equals("battleship")) {
			this.shipSize = 3;
		}
		if (this.type.equals("submarine")) {
			this.shipSize = 3;
		}
		if (this.type.equals("destroyer")) {
			this.shipSize = 4;
		}
		if (this.type.equals("carrier")) {
			this.shipSize = 5;
		}

	}

	public int getShipSize() {
		return shipSize;
	}

	public boolean isDestroid() {
		return destroid;
	}

	public Boolean placeShip(String[][] board, int x, int y, String p) {

		int newX;
		int newY;

		// Put a for loop here to check that the path ahead is clear.

		while (partsPlaced < shipSize && board[x][y] != "[ O ]") {

			if (partsPlaced == 0) {
				for (int i = 1; i < shipSize; i++) {
					board[x][y] = "[ O ]";
					xCords.add(x);
					yCords.add(y);
					partsPlaced++;
				}
			}

			if (p.equalsIgnoreCase("n")) {
				for (int i = 1; i < shipSize; i++) {
					newX = xCords.get(i - 1);
					board[(newX - i)][y] = "[ O ]";
					xCords.add(newX - i);
					yCords.add(y);
				}
			}
			if (p.equalsIgnoreCase("s")) {
				for (int i = 1; i < shipSize; i++) {
					newX = xCords.get(i - 1);
					board[(newX + i)][y] = "[ O ]";
					xCords.add(newX + i);
					yCords.add(y);
				}
			}
			if (p.equalsIgnoreCase("e")) {
				for (int i = 1; i < shipSize; i++) {
					newY = yCords.get(i - 1);
					board[x][(newY + i)] = "[ O ]";
					xCords.add(x);
					yCords.add(newY + i);
				}
			}
			if (p.equalsIgnoreCase("w")) {
				for (int i = 1; i < shipSize; i++) {
					newY = yCords.get(i - 1);
					board[x][(newY - i)] = "[ O ]";
					xCords.add(x);
					yCords.add(newY - i);
				}
			}
			partsPlaced++;

			if (board[x][y].equals("[ O ]")) {
				// System.out.println("Can not place a part in an already occupied space");
			}
			if (partsPlaced == shipSize) {
				// System.out.println("All Parts Place");
			}
		}
		return true;

	}

	public boolean checkShipState(String[][] board) {

		for (int i = 0; i < xCords.size(); i++) {

			if (board[xCords.get(i)][yCords.get(i)] == "[ X ]") {

				this.shipSize--;
				System.out.println("Hit");
				this.xCords.remove(i);
				this.yCords.remove(i);
				if (this.shipSize == 0) {

					this.destroid = true;

				}
			}

		}

		return this.destroid;

	}

}
