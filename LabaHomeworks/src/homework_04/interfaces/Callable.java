package homework_04.interfaces;

public interface Callable {

	void call();

	default void hangUp() {
		System.out.println(" Good bye ");
	}

}
