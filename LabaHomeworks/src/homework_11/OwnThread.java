package homework_11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OwnThread extends Thread {
	private static  final  Logger LOGGER = LogManager.getLogger();
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			LOGGER.info("My own Thread: " + i);
		}
	}

}
