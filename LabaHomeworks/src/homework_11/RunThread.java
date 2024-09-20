package homework_11;

public class RunThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Run Thread: " + i);
		}

	}

}
