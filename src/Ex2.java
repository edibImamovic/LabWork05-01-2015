public class Ex2 {

	public static void main(String[] args) {

		int numArray[] = { 10, 2, 6, 8, 9, 123, 7, 52, 3, 169 };
		int num;
		boolean check = false;

		System.out.println("Unesite broj");
		num = TextIO.getInt();

		for (int i = 0; i < numArray.length; i++) {
			if (num == numArray[i]) {
				check = true;
				System.out.println("index broja je " + i);
			}
		}
		if (check == false) {
			System.out.println("broj nije u intervalu");
		}

	}

}
