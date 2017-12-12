import java.util.ArrayList;

public class PeopleExercise {

	public static void main(String[] args) {

		Person tom = new Person("Tom", 18, "Tinker");
		Person dick = new Person("Dick", 22, "Tailor");
		Person harry = new Person("Harry", 24, "soldier");

		System.out.println(tom);
		System.out.println(dick);
		System.out.println(harry);

		ArrayList<Person> peopleList = new ArrayList<Person>();

		peopleList.add(tom);
		peopleList.add(dick);
		peopleList.add(harry);

		for (Person p : peopleList) {
			// System.out.print(p);
			if (p.getName() == "Tom") {
				System.out.print(p);
			}
		}

	}

}
