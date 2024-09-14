package homework_02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IPhone {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "IPhone";
	private String color;
	private int memoryСapacity;
	private double screenSize;
	private double phoneWeight;
	private boolean isButtons;
	private Display display = new Display(414,896);
	
	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public IPhone (String color) {
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
		if (memoryСapacity != 64 && memoryСapacity != 128 && memoryСapacity != 256) {
			LOGGER.info(" Incorrect value. Please check if the data is correct.");
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

	public boolean isButtons() {
		return isButtons;
	}

	public void setButtons(boolean isButtons) {
		this.isButtons = isButtons;
	}

	public String getBrand() {
		return brand;
	}

}
