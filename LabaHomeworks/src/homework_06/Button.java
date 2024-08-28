package homework_06;

public class Button {
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Button [name=" + name + ", purpose=" + purpose + ", quantity=" + quantity + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	String name;
	String purpose;
	public int quantity;
	
	public Button(String name, String purpose, int quantity) {
		super();
		this.name = name;
		this.purpose = purpose;
		this.quantity = quantity;
	}
	
	

}
