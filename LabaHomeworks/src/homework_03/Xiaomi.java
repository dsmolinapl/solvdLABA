package homework_03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Xiaomi extends Phone {
	private static  final  Logger LOGGER = LogManager.getLogger();

	private String brand = "Xiaomi";
	private int batteryLife; // hours
	private Display display = new Display(720, 988);

	@Override
	public String toString() {
		String result = super.toString();
		return result + "batteryLife: " + batteryLife + ", display: " + display.toString();
	}

	public Xiaomi(String color) {
		super(color);
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public String getBrand() {
		return brand;
	}

	public void setMemoryСapacity(int memoryCapacity) {
		if (memoryCapacity != 64 && memoryCapacity != 128 && memoryCapacity != 256) {
			LOGGER.info(" Incorrect value. Please check if the data is correct.");
		} else
			this.memoryCapacity = memoryCapacity;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		if (batteryLife < 16) {
			LOGGER.info(" Battery life is not very good ");
		}
		this.batteryLife = batteryLife;

	}

	@Override
	public void helloMassage() {
		LOGGER.info("Hello, " + brand + "'s user!");
		
	}

}
