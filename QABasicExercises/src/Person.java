
public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public void setName(String newName) {
		name = newName;

	}

	public void setAge(int newAge) {
		age = newAge;

	}

	public void setJob(String newJob) {
		jobTitle = newJob;

	}

	public String getStats() {

		String outPut;

		outPut = name + age + jobTitle;

		return outPut;
	}

}