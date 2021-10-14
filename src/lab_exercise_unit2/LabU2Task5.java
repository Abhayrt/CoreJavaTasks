package lab_exercise_unit2;

public class LabU2Task5 {

	public static void main(String[] args) {
		// pattern1
		System.out.println("1");
		for (int i = 1; i < 5; i++) {
			System.out.print("1 ");
			int t = 2 * i - 1;
			while (t > 0) {
				System.out.print("0 ");
				t--;
			}
			System.out.println("1 ");
		}

		// pattern 2
		int a = 5;

		for (int i = 1; i <= 6; i++) {
			for (int j = a; j <= 5; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
			a--;
		}

		// pattern 3
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

}
