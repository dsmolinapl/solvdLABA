package dsmolina.model;

public class OrderDetails {

	private int quantity;
	private int productID;
	private int produttID;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getProduttID() {
		return produttID;
	}
	public void setProduttID(int produttID) {
		this.produttID = produttID;
	}
	@Override
	public String toString() {
		return "OrderDetails [quantity=" + quantity + ", productID=" + productID + ", produttID=" + produttID + "]";
	}
	public OrderDetails(int quantity, int productID, int produttID) {
		super();
		this.quantity = quantity;
		this.productID = productID;
		this.produttID = produttID;
	}
	
	
}
