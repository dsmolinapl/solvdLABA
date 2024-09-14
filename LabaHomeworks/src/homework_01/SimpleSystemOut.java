package homework_01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleSystemOut {
	private static  final  Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) {
		String info = System.console().readLine("Enter users info: ");
		LOGGER.info("Users info: " + info);
	}
}
