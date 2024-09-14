package homework_04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import homework_04.interfaces.Callable;
import homework_04.interfaces.Flashlight;
import homework_04.interfaces.Gameable;
import homework_04.interfaces.ICalculate;
import homework_04.interfaces.IPhotograph;

public class Xiaomi extends Phone implements Callable, IPhotograph, Gameable, ICalculate, Flashlight {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "Xiaomi";
	private int batteryLife; // hours
	private Display display = new Display(720, 988);

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
