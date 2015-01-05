package VjezbeSort;

public class Recursion {

	public static void main(String[] args) {

		recursionNum(10);
		System.out.println(recursionSum(10));

	}

	public static void recursionNum(int num) {

		if (num < 0) {
			return;
		}

		System.out.println(num);
		recursionNum(num - 1);

	}

	public static int recursionSum(int num1) {
		if (num1 < 0) {
			return num1;
		}

		return num1 + recursionSum(num1 - 1);

	}

}
