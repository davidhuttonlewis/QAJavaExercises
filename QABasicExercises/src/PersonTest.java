import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testSetName() {

		Person p1 = new Person("Tom", 18, "Tinker");
		p1.setName("Harry");
		assertEquals("Harry", p1.getName());
	}

	@Test
	void testSetAge() {

		Person p1 = new Person("Tom", 18, "Tinker");
		p1.setAge(20);
		assertEquals(20, p1.getAge());
	}

	@Test
	void testSetJob() {

		Person p1 = new Person("Tom", 18, "Tinker");
		p1.setJob("Tailor");
		assertEquals("Tailor", p1.getJob());
	}

}
