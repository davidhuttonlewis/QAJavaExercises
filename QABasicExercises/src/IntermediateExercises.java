
public class IntermediateExercises {

	public static void main(String[] args) {

		System.out.println("Intermediate Exercises");
		IntermediateExercises ex = new IntermediateExercises();
		/*
		 * System.out.println(ex.ex1(18, 21)); System.out.println(ex.ex1(20, 18));
		 * System.out.println(ex.ex1(22, 21)); System.out.println(ex.ex1(18, 22));
		 * System.out.println(ex.ex1(19, 19)); System.out.println(ex.ex1(22, 22));
		 */
		/*
		 * System.out.println(ex.ex2(1, 2, 3)); System.out.println(ex.ex2(3, 3, 3));
		 * System.out.println(ex.ex2(1, 1, 2));
		 */

		/*
		 * System.out.println(ex.ex3(60, false)); System.out.println(ex.ex3(95, true));
		 * System.out.println(ex.ex3(95, false)); System.out.println(ex.ex3(55, false));
		 */
	}

	int ex1(int a, int b) {

		int result = 0;
		int a2 = 0;
		int b2 = 0;

		if (a <= 21) {
			a2 = a;
		}
		if (b <= 21) {
			b2 = b;
		}
		if (a2 == 0 && b2 == 0) {
			result = 0;
		}
		if (a2 == b2) {
			result = a2;
		} else if (a2 > b2) {
			result = a2;
		} else {
			result = b2;
		}

		return result;
	}

	int ex2(int a, int b, int c) {

		int sum = 0;
		int a2 = 0;
		int b2 = 0;
		int c2 = 0;

		if (a == b || a == c) {
			a2 = 0;
		} else {
			a2 = a;
		}

		if (b == a || b == c) {
			b2 = 0;
		} else {
			b2 = b;
		}

		if (c == a || c == b) {
			c2 = 0;
		} else {
			c2 = c;
		}

		sum = a2 + b2 + c2;

		return sum;
	}

	boolean ex3(int a, boolean isSummer) {

		if (isSummer == true) {
			if (a >= 60 && a <= 100) {
				return true;
			} else {
				return false;
			}
		} else {

			if (a >= 60 && a <= 90) {
				return true;
			} else {
				return false;
			}
		}

	}

}
