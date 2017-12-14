
public class Dog {

	private int name;
	private int age;
	private float height;

	public Dog(int name, int age, float height) {

		this.name = name;
		this.age = age;
		this.height = height;

	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String toString() {
		return "Name: " + name + " Age: " + age + " Height: " + height;
	}
}
