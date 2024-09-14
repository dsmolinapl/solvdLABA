package homework_06;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import homework_04.interfaces.Callable;
import homework_04.interfaces.Flashlight;
import homework_04.interfaces.Gameable;
import homework_04.interfaces.ICalculate;
import homework_04.interfaces.IPhotograph;

public class Motorola extends Phone implements Callable, IPhotograph, Gameable, ICalculate, Flashlight {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "Motorola";
	private int batteryLife;
	private Display display = new Display(375, 667);

	@Override
	public void flashlight() {
		LOGGER.info("I have lashlight");
	}

	@Override
	public void calculate() {
		LOGGER.info("I can calculate");
	}

	@Override
	public void game() {
		LOGGER.info("I have games");
	}

	@Override
	public void call() {
		LOGGER.info("I can call");
	}

	@Override
	public void photograph() {

		LOGGER.info("I can photograph");

	}

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
