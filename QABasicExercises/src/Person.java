
public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public void setJob(String jobTitle) {
		this.jobTitle = jobTitle;

	}

	public String getName() {
		return this.name;

	}

	public String toString() {

		return "Hi my name is " + this.name + " I'm " + this.age + " and I work as a " + this.jobTitle + "\n";
	}

}