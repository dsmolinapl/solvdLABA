package homework_02;

public class Vivo {
	private String brand = "Vivo";
	private String color;
	private int memoryСapacity;
	private double screenSize;
	private double phoneWeight;
	
	public Vivo(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color == "blue" || color == "black" || color == "white") {
			System.out.println( "It is a great choice" + color );
		}
		this.color = color;
	}
	public int getMemoryСapacity() {
		return memoryСapacity;
	}
	public void setMemoryСapacity(int memoryСapacity) {
		if(memoryСapacity != 64 && memoryСapacity != 128 && memoryСapacity != 256) {
			System.out.println(" Incorrect value. Please check if the data is correct.");
		} else 
		this.memoryСapacity = memoryСapacity;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public double getPhoneWeight() {
		return phoneWeight;
	}
	public void setPhoneWeight(double phoneWeight) {
		this.phoneWeight = phoneWeight;
	}
	public String getBrand() {
		return brand;
	}
		

}
