import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MapsTest {

	Maps m1 = new Maps("Map of Hyrule", "M001", "01/01/1987", "The Great Sea");

	@Test
	void setUpTest() {
		assertEquals("Map of Hyrule", m1.getTitle());
		assertEquals("Map", m1.getType());
		assertEquals("M001", m1.getId());
		assertEquals("01/01/1987", m1.getDatePublised());
		assertEquals("The Great Sea", m1.getAreaMapped());
	}

	void setTitle() {

	}

	void setID() {

	}

	void setDate() {

	}

	void setAreaMapped() {

	}

}
