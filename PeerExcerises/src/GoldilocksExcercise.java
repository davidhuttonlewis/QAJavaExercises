import java.util.ArrayList;

public class GoldilocksExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Normal input
		/*
		 * Goldilocks g1 = new Goldilocks(100, 80); Seat s1 = new Seat(30, 50); Seat s2
		 * = new Seat(130, 75); Seat s3 = new Seat(90, 60); Seat s4 = new Seat(150, 85);
		 * Seat s5 = new Seat(120, 70); Seat s6 = new Seat(200, 200); Seat s7 = new
		 * Seat(110, 100);
		 */

		Goldilocks g1 = new Goldilocks(100, 120);
		Seat s1 = new Seat(297, 90);
		Seat s2 = new Seat(66, 110);
		Seat s3 = new Seat(257, 113);
		Seat s4 = new Seat(276, 191);
		Seat s5 = new Seat(280, 129);
		Seat s6 = new Seat(219, 163);
		Seat s7 = new Seat(254, 193);
		Seat s8 = new Seat(86, 153);
		Seat s9 = new Seat(206, 147);
		Seat s10 = new Seat(71, 137);
		Seat s11 = new Seat(104, 40);
		Seat s12 = new Seat(238, 127);
		Seat s13 = new Seat(52, 146);
		Seat s14 = new Seat(129, 197);
		Seat s15 = new Seat(144, 59);
		Seat s16 = new Seat(157, 124);
		Seat s17 = new Seat(210, 59);
		Seat s18 = new Seat(11, 54);
		Seat s19 = new Seat(268, 119);
		Seat s20 = new Seat(261, 121);
		Seat s21 = new Seat(12, 189);
		Seat s22 = new Seat(186, 108);
		Seat s23 = new Seat(174, 21);
		Seat s24 = new Seat(77, 18);
		Seat s25 = new Seat(54, 90);
		Seat s26 = new Seat(174, 52);
		Seat s27 = new Seat(16, 129);
		Seat s28 = new Seat(59, 181);
		Seat s29 = new Seat(290, 123);
		Seat s30 = new Seat(248, 132);

		/*
		 * ArrayList<Seat> chairs = new ArrayList<Seat>(); chairs.add(s1);
		 * chairs.add(s2); chairs.add(s3); chairs.add(s4); chairs.add(s5);
		 * chairs.add(s6); chairs.add(s7);
		 */

		ArrayList<Seat> chairs = new ArrayList<Seat>();
		chairs.add(s1);
		chairs.add(s2);
		chairs.add(s3);
		chairs.add(s4);
		chairs.add(s5);
		chairs.add(s6);
		chairs.add(s7);
		chairs.add(s8);
		chairs.add(s9);
		chairs.add(s10);
		chairs.add(s11);
		chairs.add(s12);
		chairs.add(s13);
		chairs.add(s14);
		chairs.add(s15);
		chairs.add(s16);
		chairs.add(s17);
		chairs.add(s18);
		chairs.add(s19);
		chairs.add(s20);
		chairs.add(s21);
		chairs.add(s22);
		chairs.add(s23);
		chairs.add(s24);
		chairs.add(s25);
		chairs.add(s26);
		chairs.add(s27);
		chairs.add(s28);
		chairs.add(s29);
		chairs.add(s30);

		for (int i = 0; i < chairs.size(); i++) {

			if ((g1.getWeight() <= chairs.get(i).getLimit()) && (chairs.get(i).getHeat() <= g1.getTemperature())) {

				System.out.println(i + 1);

			}

		}

	}

}
