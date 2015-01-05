package VjezbeSort;

public class BinaryFirst {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearchU(array, 1));

	}

	public static int binarySearchU(int[] array, int numb) {

		int start = 0;
		int lastNum = array.length - 1;

		while (start < lastNum) {
			int mid = (start + lastNum) / 2;
			if (numb == array[mid]) {
				return mid;
			}

			else if (numb < array[mid]) {
				lastNum = mid - 1;
			}

			else {
				start = mid + 1;
			}
		}

		return -1;

	}
}
