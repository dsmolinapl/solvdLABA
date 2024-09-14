package homework_01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort {
	private static  final  Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) {
		int[] array = { 2, 155, 24, 36, 1 };
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}

			for (int i = 0; i < array.length; i++) {
				LOGGER.info(array[i]);
			}
		}
	}
}
