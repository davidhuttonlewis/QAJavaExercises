
public class Newspaper extends Item {

	private String typeOfPaper;

	public Newspaper(String title, String id, String datePublised, String typeOfPaper) {
		super(title, "Newspaper", id, datePublised);
		this.typeOfPaper = typeOfPaper;
		// TODO Auto-generated constructor stub
	}

	public String getTypeOfPaper() {
		return typeOfPaper;
	}

	public void setTypeOfPaper(String typeOfPaper) {
		this.typeOfPaper = typeOfPaper;
	}

	@Override
	public void updateItem() {
		// TODO Auto-generated method stub

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
	public void updateItem(Item t, int i, String field) {
		// TODO Auto-generated method stub

	}

}
