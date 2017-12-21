import java.util.ArrayList;

public class Player {

	private ArrayList<Ship> ships = new ArrayList<Ship>();

	public ArrayList<Ship> getShips() {
		return ships;
	}

	public void addShips() {
		ships.add(new Ship("patrol"));
		ships.add(new Ship("patrol"));
		ships.add(new Ship("battleship"));
		ships.add(new Ship("battleship"));
		ships.add(new Ship("submarine"));
		ships.add(new Ship("destroyer"));
		ships.add(new Ship("carrier"));
	}

	public void removeShip() {

		for (int i = 0; i < ships.size(); i++) {

			if (ships.get(i).isDestroid() == true) {
				ships.remove(i);
				System.out.println("You Sunk My Battleship");
			}

		}

	}

	// Places ships. Will want to make this increment through the number of ships
	// the player has.
	public boolean placingShips(Board b, int i, int x, int y, String facing) {

		if (x < 1 || x > b.getBoard().length - 1) {
			return false;
		} else if (y < 1 || y > b.getBoard().length - 1) {
			return false;
		} else {
			ships.get(i).placeShip(b.getBoard(), x, y, facing);
		}
		return true;
	}

	public boolean testingPlacement(Board b) {

		ships.get(0).placeShip(b.getBoard(), 1, 1, "s"); // 2 Space
		ships.get(1).placeShip(b.getBoard(), 3, 3, "w"); // 2 Spaces
		ships.get(2).placeShip(b.getBoard(), 9, 9, "e"); // 3 Spaces
		ships.get(3).placeShip(b.getBoard(), 5, 3, "w"); // 3 Spaces
		ships.get(4).placeShip(b.getBoard(), 8, 7, "n"); // 3 Spaces
		ships.get(5).placeShip(b.getBoard(), 12, 5, "n"); // 4 Spaces
		ships.get(6).placeShip(b.getBoard(), 4, 7, "w"); // 5 Spaces

		return true;

	}

	// This also wants to increment through the number of the ships the player has.
	public void checkingStateOfShips(Board b, Player p) {
		for (int i = 0; i < p.getShips().size(); i++) {
			if (this.ships.get(i).checkShipState(b.getBoard()) == true) {
				p.removeShip();
			}
		}
	}

	public boolean attack(String[][] board, int x, int y) {

		if (x < 1 || x > board.length - 1) {
			return false;
		}
		if (y < 1 || y > board.length - 1) {
			return false;
		}

		if (board[x][y] == "[ O ]") {
			board[x][y] = "[ X ]";
		} else if (board[x][y] == "[ X ]") {
			board[x][y] = "[ X ]";
		} else {
			board[x][y] = "[ M ]";
		}

		return true;

	}

}
