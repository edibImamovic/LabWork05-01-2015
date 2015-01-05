public class Ex1 {

	public static void main(String[] args) {

		System.out.println("Unesite neki broj");
		int numEx = TextIO.getInt();

		int num = 1 + (int) (Math.random() * (100));

		if ((0 > numEx) || (numEx > 100)) {
			throw new IllegalArgumentException(
					"Broj ne moze biti manji od 0 ili veci od 100");
		}

		while (numEx != num) {
			if (numEx < num) {
				System.out.println("Uneseni broj je veci, ponovo unesite broj");
				numEx = TextIO.getInt();

			}

			if (numEx > num) {
				System.out
						.println("Uneseni broj je manji, unesite ponovo neki broj");
				numEx = TextIO.getInt();

			}

		}

		if (numEx == num) {
			System.out.println("Pogodili ste, bravo :)");
		}

	}

}
