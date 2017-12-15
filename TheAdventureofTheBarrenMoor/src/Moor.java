
public class Moor {

	private String[][] moorMap = new String[10][10];

	public void setUpMoor() {

		for (int i = 0; i < moorMap.length; i++) {

			for (int j = 0; j < moorMap.length; j++) {

				moorMap[i][j] = "?";
			}
		}
	}

	public String[][] getMoorMap() {
		return moorMap;
	}

	public void setMoorMap(String[][] moorMap) {
		this.moorMap = moorMap;
	}

	public void printMoor() {

		for (int i = 0; i < moorMap.length; i++) {

			for (int j = 0; j < moorMap.length; j++) {

				System.out.print(moorMap[i][j] + " ");

			}
			System.out.print("\n");

		}
	}

	public void addPlayer(int i, int j) {

		moorMap[i][j] = "P";

	}

	public void removePlayer(int i, int j) {

		moorMap[i][j] = "*";

	}

	public void addTreasure(int i, int j) {

		moorMap[i][j] = "T";

	}

}
