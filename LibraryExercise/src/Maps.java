
public class Maps extends Item {

	private String areaMapped;

	public Maps(String title, String id, String datePublised, String areaMapped) {
		super(title, "Map", id, datePublised);
		this.areaMapped = areaMapped;
		// TODO Auto-generated constructor stub
	}

	public String getAreaMapped() {
		return areaMapped;
	}

	public void setAreaMapped(String areaMapped) {
		this.areaMapped = areaMapped;
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
