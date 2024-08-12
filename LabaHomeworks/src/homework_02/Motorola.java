package homework_02;

public class Motorola {
	private String brand = "Motorola";
	private String color;
	private int memoryСapacity;
	private double screenSize;
	private double phoneWeight;
	private int batteryLife;
	private Display display = new Display(375 , 667);
	
	
	
	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Motorola (String color) {
		this.color = color;
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
		if(phoneWeight>1.5) {
			System.out.println("Sorry, you entered the wrong weight.");
		}
		this.phoneWeight = phoneWeight;
	}
	public int getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	public String getBrand() {
		return brand;
	}
	

}
