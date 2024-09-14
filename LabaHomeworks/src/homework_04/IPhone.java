package homework_04;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import homework_04.interfaces.Callable;
import homework_04.interfaces.Flashlight;
import homework_04.interfaces.Gameable;
import homework_04.interfaces.ICalculate;
import homework_04.interfaces.IPhotograph;

public class IPhone extends Phone implements Callable, IPhotograph, Gameable, ICalculate, Flashlight {
	private static  final  Logger LOGGER = LogManager.getLogger();
	private String brand = "IPhone";
	private boolean isButtons;
	private Display display = new Display(414, 896);

	public IPhone(String color) {
		super(color);
	}

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
		return result + " brand: " + brand + " , isButtons: " + isButtons + ", display: " + display.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, display, isButtons);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPhone other = (IPhone) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(display, other.display)
				&& isButtons == other.isButtons;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public void setMemoryCapacity(int memoryCapacity) {
		if (memoryCapacity != 64 && memoryCapacity != 128 && memoryCapacity != 256) {
			LOGGER.info(" Incorrect value. Please check if the data is correct.");
		} else
			this.memoryCapacity = memoryCapacity;
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

	@Override
	public void helloMassage() {
		LOGGER.info("Hello, " + brand + "'s user!");

	}

}
