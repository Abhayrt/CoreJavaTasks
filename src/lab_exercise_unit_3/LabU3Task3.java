package lab_exercise_unit_3;

public class LabU3Task3 {
	public void sum(int a, int b) { // call by reference.
		
		System.out.println(a+b);

	}
	public static void main(String[] args) {
		
		LabU3Task3 obj=new LabU3Task3();
		obj.sum(5, 2); //call by value.
		
	}

}
