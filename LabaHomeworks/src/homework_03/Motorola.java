package homework_03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Motorola extends Phone {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "Motorola";
	private int batteryLife;
	private Display display = new Display(375, 667);

	@Override
	public String toString() {
		String result = super.toString();
		return result + "brand: " + brand + " , batteryLife: " + batteryLife + ", display: " + display.toString();
	}

	public Motorola(String color) {
		super(color);
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public void setMemoryСapacity(int memoryСapacity) {
		if (memoryСapacity != 64 && memoryСapacity != 128 && memoryСapacity != 256) {
			LOGGER.info(" Incorrect value. Please check if the data is correct.");
		} else
			this.memoryCapacity = memoryСapacity;
	}

	public void setPhoneWeight(double phoneWeight) {
		if (phoneWeight > 1.5) {
			LOGGER.info("Sorry, you entered the wrong weight.");
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

	@Override
	public void helloMassage() {
		LOGGER.info("Hello, " + brand + "'s user!");	
		
	}

}
