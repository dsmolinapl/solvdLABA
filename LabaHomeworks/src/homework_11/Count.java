package homework_11;

public class Count {
	static private String countDownToNewYear[] = { "10 seconds", "9 seconds", "8 seconds", "7 seconds", "6 seconds",
			"5 seconds", "4 seconds", "3 seconds", "2 seconds", "1 second", "New Year!!!" };

	public static void printCountDown() throws InterruptedException {
		for (int i = 0; i < countDownToNewYear.length; i++) {
			Thread.sleep(1000);// Pause for 1 seconds
			System.out.println(countDownToNewYear[i]);
		}
	}

}
