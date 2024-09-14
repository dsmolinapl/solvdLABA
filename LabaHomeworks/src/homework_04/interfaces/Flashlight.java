package homework_04.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Flashlight {
	 static  final  Logger LOGGER = LogManager.getLogger();
	void flashlight();
	
	default void light(boolean a) {
		LOGGER.info("Should I turn on the flashlight? - " + a);
	}

}
