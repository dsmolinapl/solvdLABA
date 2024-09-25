package homework_11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static  final  Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		OwnThread ownThread = new OwnThread();
		ownThread.start();
		Thread runThread = new Thread(new RunThread());
		runThread.start();
		CallThread callThread = new CallThread();
		ExecutorService executorService = Executors.newSingleThreadExecutor();
	    Future<Integer> future = executorService.submit(callThread);
	 
		for (int i = 0; i < 100; i++) {
			LOGGER.info("Main Thread: " + i);
		}
		Count.printCountDown();

	    LOGGER.info("Result: " + future.get().intValue());

	}

}
