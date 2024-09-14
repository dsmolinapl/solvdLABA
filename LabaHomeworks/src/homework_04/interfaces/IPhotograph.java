package homework_04.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IPhotograph {
	static  final  Logger LOGGER = LogManager.getLogger();

	void photograph();

	default void zoom(int zoomRatio) {
		LOGGER.info(" Zoom ratio: " + zoomRatio);
	}

}
