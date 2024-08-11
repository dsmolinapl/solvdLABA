package homework_01;

public class SimpleSystemOut {

	public static void main(String[] args) {
		String info = System.console().readLine("Enter users info: ");
		System.out.println("Users info: " + info);
	}
}
