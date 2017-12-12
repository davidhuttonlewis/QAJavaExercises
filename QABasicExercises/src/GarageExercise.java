
public class GarageExercise {

	public static void main(String[] args) {

		Garage g1 = new Garage();
		g1.stockGarage();
		Boat b2 = new Boat("BU666", "NTR", "smallboat", true);

		g1.addVehicle(b2);

		System.out.println(g1.caculateBill("BU666"));

		g1.removeVehicleByReg("BU666");

		System.out.println(g1.caculateBill("BU666"));

		g1.removeVehicleByType("Car");

		System.out.println(g1.caculateBill("CK12HTV"));
		System.out.println(g1.caculateBill("CK13HTV"));

		g1.emptyGarage();
		System.out.println(g1.caculateBill("CK12HTV"));
		System.out.println(g1.caculateBill("CK13HTV"));

	}

}
