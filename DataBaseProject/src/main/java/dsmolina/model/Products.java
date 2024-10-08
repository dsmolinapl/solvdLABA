package dsmolina.model;

public class Products {
	
	private String name;
	private int price;
	
	@Override
	public String toString() {
		return "Product: [name=" + name + ", price=" + price + "]";
	}
	
	public Products(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
