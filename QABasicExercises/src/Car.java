
public class Car extends Vehicle {

	private int numOfDoors;

	public Car(String reg, String make, String model, int numOfDoors) {
		this.type = "Car";
		this.reg = reg;
		this.make = make;
		this.model = model;
		this.numOfDoors = numOfDoors;
	}

	public int getNumOfDoors() {
		return this.numOfDoors;
	}

	public String toString() {
		return this.reg + " " + this.make + " " + this.model + " " + this.numOfDoors;
	}
}
