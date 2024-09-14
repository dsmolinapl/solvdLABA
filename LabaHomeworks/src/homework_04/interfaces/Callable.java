package homework_04.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Callable {
	static  final  Logger LOGGER = LogManager.getLogger();

	void call();

	default void hangUp() {
		LOGGER.info(" Good bye ");
	}

}
