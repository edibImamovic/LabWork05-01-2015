public class ExSort {

	public static void main(String[] args) {
		int[] num = new int[] { 214, 25, 66, 88, 99, 258, 54, 33 };

		insertionSort(num);

		for (int n : num) {
			System.out.println(n);
		}

	}

	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int newPos = i;

			while (newPos > 0 && array[newPos - 1] > array[newPos]) {

				int t = array[newPos - 1];
				array[newPos - 1] = array[newPos];
				array[newPos] = t;

				newPos--;
			}
		}

	}

	public static void bubbleSort(int[] array) {

		for (int i = array.length - 1; i >= 0; i--) {
			int maxIndex = array[0];

			for (int j = 1; j <= i; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}

			int t = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = t;
		}

	}

}
