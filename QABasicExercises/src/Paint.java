
public class Paint {

	private String name;
	private float amount;
	private float price;
	private float cover;

	public Paint(String name, int amount, float price, int cover) {
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.cover = cover;
	}

	public String getName() {
		return name;
	}

	public float getCover() {
		return cover;
	}

	public void setCover(int cover) {
		this.cover = cover;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getCoverage() {
		return amount * cover;
	}

	public String toString() {
		return "Name: " + this.name + " Litres: " + this.amount + " £" + this.price + " " + this.cover + "m";
	}

}
