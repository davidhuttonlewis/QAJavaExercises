
public class Book extends Item {

	private String autor;

	public Book(String title, String id, String datePublised, String autor) {
		super(title, "Book", id, datePublised);
		this.autor = autor;
		// TODO Auto-generated constructor stub
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public void updateItem(Item t, int i, String field) {
		switch (i) {
		case 1:
			t.setTitle(field);
			break;
		case 2:
			t.setId(field);
		case 3:
			t.setDatePublised(field);
		case 4:
			((Book) t).setAutor(field);
		}

	}

	@Override
	public void removeItem() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateItem() {
		// TODO Auto-generated method stub

	}

}
