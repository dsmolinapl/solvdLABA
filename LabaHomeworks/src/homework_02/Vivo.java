package homework_02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vivo {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "Vivo";
	private String color;
	private int memoryСapacity;
	private double screenSize;
	private double phoneWeight;
	private Display display = new Display(390 , 844);
	
	
	public Vivo(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if (color == "blue" || color == "black" || color == "white") {
			LOGGER.info( "It is a great choice" + color );
		}
		this.color = color;
	}
	public int getMemoryСapacity() {
		return memoryСapacity;
	}
	public void setMemoryСapacity(int memoryСapacity) {
		if(memoryСapacity != 64 && memoryСapacity != 128 && memoryСapacity != 256) {
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
	public String getBrand() {
		return brand;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
	
		

}
