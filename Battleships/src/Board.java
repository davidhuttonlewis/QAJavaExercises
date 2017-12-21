
public class Board {

	private String[][] board = new String[13][13];

	public String[][] getBoard() {
		return board;
	}

	void setupBoard() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {

				board[i][j] = "[ ~ ]";
				board[i][0] = String.format("% 4d", i);
				board[0][j] = String.format("% 5d", j);
				board[0][0] = "  ";

			}
		}
	}

	void drawBoard() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {

				System.out.print(board[i][j] + " ");

			}
			System.out.println("");
		}
	}
}
