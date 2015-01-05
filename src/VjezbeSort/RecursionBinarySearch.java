package VjezbeSort;

public class RecursionBinarySearch {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int numb = 2;
		int a = recursionSort(array, numb, 0, array.length - 1);
		System.out.println(a);

	}

	public static int recursionSort(int[] array, int numb, int start, int end) {

		while (start < end) {
			int mid = (start + end) / 2;
			if (numb == array[mid]) {
				return mid;
			}

			else if (numb < array[mid]) {
				end = mid - 1;
			}

			else {
				start = mid + 1;
			}
		}

		return recursionSort(array, numb, start, end);

	}

}
