package homework_04.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface ICalculate {
	 static  final  Logger LOGGER = LogManager.getLogger();

	void calculate();

	default void amount(int a, int b) {
		int amount = a + b;
		LOGGER.info(" I can calculate, a + b =  " + amount);
	}

}
