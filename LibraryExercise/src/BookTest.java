import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BookTest {

	Book b1 = new Book("The Northen Lights", "B001", "01/01/2000", "Phillip Pullam");

	@Test
	void setUpTest() {
		assertEquals("The Northen Lights", b1.getTitle());
		assertEquals("Book", b1.getType());
		assertEquals("B001", b1.getId());
		assertEquals("01/01/2000", b1.getDatePublised());
		assertEquals("Phillip Pullam", b1.getAutor());
	}

	void setTitle() {

	}

	void setID() {

	}

	void setDate() {

	}

	void setAutor() {

	}
}
