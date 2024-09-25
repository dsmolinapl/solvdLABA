package homework_11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Count {
	private static  final  Logger LOGGER = LogManager.getLogger();
	static private String countDownToNewYear[] = { "10 seconds", "9 seconds", "8 seconds", "7 seconds", "6 seconds",
			"5 seconds", "4 seconds", "3 seconds", "2 seconds", "1 second", "New Year!!!" };

	public static void printCountDown() throws InterruptedException {
		for (int i = 0; i < countDownToNewYear.length; i++) {
			Thread.sleep(1000);// Pause for 1 seconds
			LOGGER.info(countDownToNewYear[i]);
		}
	}

}
