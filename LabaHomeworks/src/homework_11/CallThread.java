package homework_11;

import java.util.concurrent.Callable;

public class CallThread implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int result = 0;
		for (int i = 0; i < 100; i += 2) {
			System.out.println("Call Thread: " + i);
			result += i;
		}
		return result;
	}

}
