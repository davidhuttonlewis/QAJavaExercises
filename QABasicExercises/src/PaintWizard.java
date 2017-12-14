import java.util.ArrayList;

public class PaintWizard {

	private ArrayList<Paint> listOfPaints = new ArrayList<Paint>();

	public void setUpPaints() {

		listOfPaints.add(new Paint("CheapoMax", 20, 19.99F, 10));
		listOfPaints.add(new Paint("AverageJoes", 15, 17.99F, 11));
		listOfPaints.add(new Paint("Duluxourous", 10, 25.00F, 20));

	}

	public String willItCover(float coverage, Room room) {
		float needs;
		String outPut = "";
		needs = room.getSize() * room.getCoats();

		if (needs <= coverage) {
			outPut = "This Paint will cover the Room";
		}

		return outPut;
	}

	public float pricePreLiter(int i) {
		float result = listOfPaints.get(i).getPrice() / listOfPaints.get(i).getAmount();

		return result;
	}

	public float wastage(float cover, float coverage, Room room) {

		float needs = room.getSize() * room.getCoats();

		return (coverage - needs) / cover;

	}

	public String leastWaste(Room room) {
		float waste;
		float minWaste = wastage(listOfPaints.get(0).getCover(), listOfPaints.get(0).getCoverage(), room);
		int index = 0;

		for (int i = 0; i < listOfPaints.size(); i++) {
			waste = wastage(listOfPaints.get(i).getCover(), listOfPaints.get(i).getCoverage(), room);
			if (waste < minWaste) {
				index = i;
				minWaste = waste;
			}

		}

		return "The paint that wastes the least is " + listOfPaints.get(index).getName();
	}

	public String cheapestPaint() {

		float cost;
		float minCost = listOfPaints.get(0).getPrice();
		int index = 0;

		for (int i = 0; i < listOfPaints.size(); i++) {
			cost = listOfPaints.get(i).getPrice();
			if (cost < minCost) {
				index = i;
				minCost = cost;
			}

		}
		return "The Cheapest Paint is " + listOfPaints.get(index).getName();
	}

	public String outPut(int i, Room room) {

		float waste = wastage(listOfPaints.get(i).getCover(), listOfPaints.get(i).getCoverage(), room);

		return listOfPaints.get(i).getName() + " " + willItCover(listOfPaints.get(i).getCoverage(), room)
				+ " \nThis will waste " + waste + " Litres " + "This leaves "
				+ Math.round(((pricePreLiter(i) * waste) * 100.0)) / 100.0;
	}

}
