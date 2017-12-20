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
	public void placingShips(Board b) {
		ships.get(0).placeShip(b.getBoard(), 0, 0, "s");
		ships.get(1).placeShip(b.getBoard(), 2, 2, "w");
		ships.get(2).placeShip(b.getBoard(), 4, 4, "e");
		ships.get(3).placeShip(b.getBoard(), 10, 6, "s");
		ships.get(4).placeShip(b.getBoard(), 4, 11, "w");
		// ships.get(5).placeShip(b.getBoard(), 2, 2, "w");
		// ships.get(6).placeShip(b.getBoard(), 2, 2, "w");

		// ships.get(1).placeShip(b.getBoard(), 2, 2);

	}

	// This also wants to increment through the number of the ships the player has.
	public void checkingStateOfShips(Board b, Player p) {
		for (int i = 0; i < p.getShips().size(); i++) {
			if (ships.get(i).checkShipState(b.getBoard()) == true) {
				p.removeShip();
			}
		}
	}

	public String[][] attack(String[][] board, int x, int y) {

		if (board[x][y] == "[ O ]") {
			board[x][y] = "[ X ]";
		} else {
			board[x][y] = "[ M ]";
		}

		return board;

	}

}
