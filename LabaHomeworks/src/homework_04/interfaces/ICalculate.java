package homework_04.interfaces;

public interface ICalculate {

	void calculate();

	default void amount(int a, int b) {
		int amount = a + b;
		System.out.println(" I can calculate, a + b =  " + amount);
	}

}
