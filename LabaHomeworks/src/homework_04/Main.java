package homework_04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	public static void main(String[] args) {
		final  Logger LOGGER = LogManager.getLogger();

		IPhone myIPhone = new IPhone("white");
		IPhone myIPhone2 = new IPhone("white");
		Motorola myMotorola = new Motorola("black");
		Samsung mySamsung = new Samsung(true, "white");
		Vivo myVivo = new Vivo("white");
		Xiaomi myXiaomi = new Xiaomi("blue");

		Headphones iPhoneHeadphones = new Headphones("IPhone");
		Headphones samsungHeadphones = new Headphones("Samsung");
		LOGGER.info("WireLength IPhone: " + iPhoneHeadphones.WireLength);
		LOGGER.info("WireLength Samsung: " + samsungHeadphones.WireLength);
		Headphones.soundVolume = 30;
		LOGGER.info(Headphones.soundVolume);

		myIPhone.call();
		myIPhone.photograph();
		myIPhone.hangUp();
		myIPhone.zoom(6);
		myIPhone.amount(1, 7);
		myIPhone.light(true);
		

	}

}
