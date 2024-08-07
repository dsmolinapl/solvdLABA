package first_class;

public class BubbleSort {
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
				System.out.println(array[i]);
			}
		}
	}
}
