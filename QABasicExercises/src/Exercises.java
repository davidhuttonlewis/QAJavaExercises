
public class Exercises {
	
	public static void main (String[] args) {
		
		String message = "Hello World!";
		Exercises ex = new Exercises();
		//ex.ex1(message);
		//System.out.println(ex.ex2());
		//System.out.println(ex.ex3(2, 3, true));
		//System.out.println(ex.ex3(3, 3, false));
		//System.out.println(ex.ex3(2, 0, false));
		//System.out.println(ex.ex3(0, 3, true));
		//ex.ex4(ex);
		//ex.ex5(ex);
		//ex.ex6();
	}

	void ex1(String message) {
		
		System.out.println(message);
		
	}
	
	String ex2() {
		
		return "Hello World!";
	}
	
	int ex3(int a, int b, boolean c) {
		
		//int returnVal = 0;
		
		if (a == 0) {
			return b;
		}
		else if (b == 0) {
			return a;
		}
		else if (c == true) {
			return a + b;
		}
		else {
			return a * b;
		}
		
	}
	
	void ex4(Exercises ex) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(ex.ex3(i, 2, true));
		}
			
	}
	
	void ex5(Exercises ex) {
		int[] myArray = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i <=9; i++) {
			System.out.println(myArray[i]);
		}
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(ex.ex3(myArray[i], 2, true));
		}
	}
	
	void ex6() {
		int[] myArray = new int [10];
		
		for(int i = 0; i <= 9; i++) {
		myArray[i] = i+1;
		System.out.println(myArray[i]);
		}
		
		for(int i = 0; i <= 9; i++) {
			myArray[i] = myArray[i] * 10;
			System.out.println(myArray[i]);
			}
		}
	}
	
	
	

	

