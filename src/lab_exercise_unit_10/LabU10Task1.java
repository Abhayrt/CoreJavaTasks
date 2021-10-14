package lab_exercise_unit_10;

class LabU10Task1 {
	public static void main(String a[]) {
		try {
			int a1[] = new int[-2];
			System.out.println("first element : " + a1[0]);
		} catch (NegativeArraySizeException n) {
			System.out.println(" generated exception : " + n);
		}
		System.out.println(" After the try block");
	}
}
