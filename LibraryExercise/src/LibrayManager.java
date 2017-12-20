import java.util.ArrayList;

public class LibrayManager {

	private ArrayList<Item> Library = new ArrayList<Item>();

	public ArrayList<Item> getLibrary() {
		return Library;
	}

	public void setUpLibrary() {

		Library.add(new Book("The Northen Lights", "B001", "01/01/2000", "Phillip Pullam"));
		Library.add(new Maps("Map of Hyrule", "M001", "01/01/1987", "Tingle"));
		Library.add(new Newspaper("The Times", "N001", "01/01/2010", "Broadsheet"));
	}

	public void setCheckedOut(Item t) {

		t.setCheckedOut(true);
	}

	public void setCheckedIn(Item t) {

		t.setCheckedOut(false);
	}

	public void addBook(String name, String id, String datePublised, String autor) {

		Library.add(new Book(name, id, datePublised, autor));

	}

	public void addMap() {

	}

	public void addNewspaper() {

	}

}
