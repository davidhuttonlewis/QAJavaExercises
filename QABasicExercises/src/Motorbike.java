
public class Motorbike extends Vehicle {

	private int numOfCrashes;

	public Motorbike(String reg, String make, String model, int numOfCrashes) {
		this.type = "Motorbike";
		this.reg = reg;
		this.make = make;
		this.model = model;
		this.numOfCrashes = numOfCrashes;
	}

	public int getNumOfDoors() {
		return this.numOfCrashes;
	}

	public String toString() {
		return this.reg + " " + this.make + " " + this.model + " number of crashes" + this.numOfCrashes;
	}

}
