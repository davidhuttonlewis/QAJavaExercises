
public class Seat {
	private int limit;
	private int heat;

	public Seat(int limit, int heat) {
		this.limit = limit;
		this.heat = heat;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getHeat() {
		return heat;
	}

	public void setHeat(int heat) {
		this.heat = heat;
	}

}