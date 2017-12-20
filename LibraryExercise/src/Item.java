
public abstract class Item implements Manager {

	private String title;
	private String type;
	private String id;
	private String datePublised;
	private boolean checkedOut = false;

	public Item(String title, String type, String id, String datePublised) {
		this.title = title;
		this.type = type;
		this.id = id;
		this.datePublised = datePublised;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDatePublised() {
		return datePublised;
	}

	public void setDatePublised(String datePublised) {
		this.datePublised = datePublised;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

}
