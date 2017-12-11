import java.util.ArrayList;

public class PeopleExercise {

	public static void main(String[] args) {

		Person Tom = new Person();
		Person Dick = new Person();
		Person Harry = new Person();
		Tom.setAge(18);
		Tom.setJob("Tinker");
		Tom.setName("Tom");

		Dick.setAge(22);
		Dick.setJob("Talour");
		Dick.setName("Dick");

		Harry.setAge(24);
		Harry.setJob("Solidger");
		Harry.setName("Harry");

		// System.out.println(Tom.getStats());

		ArrayList al = new ArrayList();

		al.add(Tom);
		al.add(Dick);
		al.add(Harry);

		for (int count : al) {

		}

	}

}
