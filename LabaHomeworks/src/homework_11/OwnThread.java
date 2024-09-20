package homework_11;

public class OwnThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("My own Thread: " + i);
		}
	}

}
