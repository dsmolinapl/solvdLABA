package homework_04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Headphones {
	private static  final  Logger LOGGER = LogManager.getLogger();
	static final int WireLength = 15;

	String modelPhone;
	String name;
	static int soundVolume = 50;// static variable 

	static {
		LOGGER.info(" Static block");// static block
	}

	public static void charge() {
		LOGGER.info(" plug in the charger "); // - static method
	}

	public Headphones(String name) {
		this.name = name;
	}

	public final void connect() {
		LOGGER.info(" Headphones plugged in! ");
	}
}