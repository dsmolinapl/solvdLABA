package homework_04.interfaces;

public interface Flashlight {
	void flashlight();
	
	default void light(boolean a) {
		System.out.println("Should I turn on the flashlight? - " + a);
	}

}
