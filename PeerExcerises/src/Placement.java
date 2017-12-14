
public class Placement {

	private int[] myArray = new int[100];
	private Dog[] dogArray = new Dog[100];

	Dog d1 = null;

	public void setUpPlacement() {

		for (int i = 0; i < myArray.length; i++) {

			myArray[i] = i + 1;

		}
	}

	public void enterDogs() {

		for (int i = 0; i < dogArray.length; i++) {

			dogArray[i] = d1 = new Dog(i, i, i);

		}
	}

	public String winningDog(int winner) {

		d1 = dogArray[winner];
		return d1.toString();

	}

	public String printPlacement(int input) {

		for (int i = 0; i < myArray.length; i++) {

			if (myArray[i] == input) {
				i++;

			}

			if (myArray[i] == 1 || myArray[i] == 21 || myArray[i] == 31 || myArray[i] == 41 || myArray[i] == 51
					|| myArray[i] == 61 || myArray[i] == 71 || myArray[i] == 81 || myArray[i] == 91) {
				System.out.println(myArray[i] + "st");
				// return myArray[i] + "st";
			} else if (myArray[i] == 2 || myArray[i] == 22 || myArray[i] == 32 || myArray[i] == 42 || myArray[i] == 52
					|| myArray[i] == 62 || myArray[i] == 72 || myArray[i] == 82 || myArray[i] == 92) {
				System.out.println(myArray[i] + "nd");
				// return myArray[i] + "nd";
			} else if (myArray[i] == 3 || myArray[i] == 23 || myArray[i] == 33 || myArray[i] == 43 || myArray[i] == 53
					|| myArray[i] == 63 || myArray[i] == 73 || myArray[i] == 83 || myArray[i] == 93) {
				System.out.println(myArray[i] + "rd");
				// return myArray[i] + "rd";
			}

			else {
				System.out.println(myArray[i] + "th");
				// return myArray[i] + "th";
			}

		}
		return "oops";
	}

}
