import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NewspaperTest {

	Newspaper n1 = new Newspaper("The Times", "N001", "01/01/2010", "Broadsheet");

	@Test
	void setUpTest() {
		assertEquals("The Times", n1.getTitle());
		assertEquals("Newspaper", n1.getType());
		assertEquals("N001", n1.getId());
		assertEquals("01/01/2010", n1.getDatePublised());
		assertEquals("Broadsheet", n1.getTypeOfPaper());
	}

	void setTitle() {

	}

	void setID() {

	}

	void setDate() {

	}

	void setTypeOfPaper() {

	}

}
