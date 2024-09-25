package homework_11;

import java.util.concurrent.Callable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CallThread implements Callable<Integer> {
	private static  final  Logger LOGGER = LogManager.getLogger();

	@Override
	public Integer call() throws Exception {
		int result = 0;
		for (int i = 0; i < 100; i += 2) {
			LOGGER.info("Call Thread: " + i);
			result += i;
		}
		return result;
	}

}
