package homework_03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static  final  Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) {
		

		IPhone myIPhone = new IPhone("white");
		IPhone myIPhone2 = new IPhone("white");
		Motorola myMotorola = new Motorola("black");
		Samsung mySamsung = new Samsung(true, "white");
		Vivo myVivo = new Vivo("white");
		Xiaomi myXiaomi = new Xiaomi("blue");

		LOGGER.info("Equals for Displays : " + myIPhone.getDisplay().equals(myXiaomi.getDisplay()));
		LOGGER.info("Equals for color, memoryCapacity, phoneWeight : " + myMotorola.equals(mySamsung));
		LOGGER.info("myIPhone hashCode : " + myIPhone.hashCode());

		myIPhone.setMemoryCapacity(256);
		LOGGER.info(myIPhone.getMemoryCapacity());

		myMotorola.setPhoneWeight(1.3);
		LOGGER.info(myMotorola.getPhoneWeight());
		myMotorola.setMemoryСapacity(64);
		LOGGER.info(myMotorola.getMemoryCapacity());

		LOGGER.info(myIPhone.toString());
		LOGGER.info(myMotorola.toString());
		LOGGER.info(mySamsung.toString());
		LOGGER.info(myVivo.toString());
		LOGGER.info(myXiaomi.toString());

	}

}
