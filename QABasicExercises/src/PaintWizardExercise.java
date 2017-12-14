
public class PaintWizardExercise {

	public static void main(String[] args) {

		Room pRoom = new Room(10, 4);
		PaintWizard pWiz = new PaintWizard();

		pWiz.setUpPaints();

		System.out.println(pWiz.outPut(0, pRoom));
		System.out.println(pWiz.outPut(1, pRoom));
		System.out.println(pWiz.outPut(2, pRoom));
		System.out.println(pWiz.leastWaste(pRoom));
		System.out.println(pWiz.cheapestPaint());
	}

}