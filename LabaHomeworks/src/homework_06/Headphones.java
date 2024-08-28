package homework_06;

public final class Headphones {

	static final int WireLength = 15;

	String modelPhone;
	String name;
	static int soundVolume = 50;// static variable 

	static {
		System.out.println(" Static block");// static block
	}

	public static void charge() {
		System.out.println(" plug in the charger "); // - static method
	}

	public Headphones(String name) {
		this.name = name;
	}

	public final void connect() {
		System.out.println(" Headphones plugged in! ");
	}
}