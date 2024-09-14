package homework_04.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Gameable {
	 static  final  Logger LOGGER = LogManager.getLogger();
	void game();

	default void downloadGame() {
		LOGGER.info(" Game downloaded! ");
	}

}
