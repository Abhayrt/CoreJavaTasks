package lab_exercise_unit_10;



	class LabU10Task5Throws{
	public static void main(String a[]) throws ArithmeticException{
		System.out.println("Inside main");
		int I = 0;
		int j = 40/I;
		System.out.println("this statement is not printed");
	}
	}