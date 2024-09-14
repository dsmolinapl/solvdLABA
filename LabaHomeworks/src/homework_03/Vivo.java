package homework_03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vivo extends Phone {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "Vivo";
	private Display display = new Display(390, 844);

	@Override
	public String toString() {
		String result = super.toString();
		return result + "brand: " + brand + ", display: " + display.toString();
	}

	public Vivo(String color) {
		super(color);
	}

	public void setColor(String color) {
		if (color == "blue" || color == "black" || color == "white") {
			LOGGER.info("It is a great choice" + color);
		}
		this.color = color;
	}

	public int getMemoryСapacity() {
		return memoryCapacity;
	}

	public void setMemoryСapacity(int memoryСapacity) {
		if (memoryСapacity != 64 && memoryСapacity != 128 && memoryСapacity != 256) {
			LOGGER.info(" Incorrect value. Please check if the data is correct.");
		} else
			this.memoryCapacity = memoryСapacity;
	}

	public String getBrand() {
		return brand;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	@Override
	public void helloMassage() {
		LOGGER.info("Hello, " + brand + "'s user!");
		
	}

}
