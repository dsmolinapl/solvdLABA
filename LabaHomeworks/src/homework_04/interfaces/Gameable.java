package homework_04.interfaces;

public interface Gameable {
	void game();

	default void downloadGame() {
		System.out.println(" Game downloaded! ");
	}

}
