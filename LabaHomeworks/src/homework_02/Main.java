package homework_02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static  final  Logger LOGGER = LogManager.getLogger();
	public static void main (String[]args) {
		
		IPhone myIPhone = new IPhone("white");
		Motorola myMotorola = new Motorola("blue");
		Samsung mySamsung = new Samsung(true);
		Vivo myVivo = new Vivo("pink");
		Xiaomi myXiaomi = new Xiaomi("blue");
		
		myIPhone.setMemoryСapacity(256);
		LOGGER.info(myIPhone.getMemoryСapacity());
		
		myMotorola.setPhoneWeight(1.3);
		LOGGER.info(myMotorola.getPhoneWeight());
		myMotorola.setMemoryСapacity(156);
		LOGGER.info(myMotorola.getMemoryСapacity());
		
		
		
		
	}

}
