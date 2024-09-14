package homework_03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Samsung extends Phone {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "Samsung";
	private double screenSize;
	private boolean isExpensive;
	private Display display = new Display(1080, 720);

	@Override
	public String toString() {
		String result = super.toString();
		return result + " isExpensive: " + isExpensive + ", display: " + display.toString();
	}

	public Samsung(boolean isExpensive, String color) {
		super(color);
		this.isExpensive = isExpensive;
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

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
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

	@Override
	public void helloMassage() {
		LOGGER.info("Hello, " + brand + "'s user!");
		
	}

}
