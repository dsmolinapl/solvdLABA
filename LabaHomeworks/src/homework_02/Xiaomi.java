package homework_02;

public class Xiaomi {
	private String brand = "Xiaomi";
	private String color;
	private int memoryСapacity;
	private double screenSize;
	private double phoneWeight;
	private int batteryLife; // hours
	private Display display = new Display(720,988);
	
	
	
	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Xiaomi (String color) {
		this.color = color;	
	}
	
	public String getBrand() {
		return brand;
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
	public int getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(int batteryLife) {
		if (batteryLife < 16) {
			System.out.println(" Battery life is not very good ");
		}
		this.batteryLife = batteryLife;
		
	}

}
