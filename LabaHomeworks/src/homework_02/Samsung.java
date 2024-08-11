package homework_02;

public class Samsung {
	private String brand = "Samsung";
	private String color;
	private int memoryСapacity;
	private double screenSize;
	private double phoneWeight;
	private boolean isExpensive;
	
	public Samsung (boolean isExpensive) {
		this.isExpensive = isExpensive;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {	
		
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
	public boolean isExpensive() {
		return isExpensive;
	}
	public void setExpensive(boolean isExpensive) {
		this.isExpensive = isExpensive;
	}
	public String getBrand() {
		return brand;
	}
		
		

}
