package dsmolina.model;

public class Orders {
	private String data;
	private int userName;
	
	
	public Orders(String data, int userName) {
		super();
		this.data = data;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Orders [data=" + data + ", userName=" + userName + "]";
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getUserName() {
		return userName;
	}
	public void setUserName(int userName) {
		this.userName = userName;
	}
	

}
