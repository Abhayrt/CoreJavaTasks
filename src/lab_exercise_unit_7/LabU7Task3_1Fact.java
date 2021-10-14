package lab_exercise_unit_7;

public class LabU7Task3_1Fact{
	int fact (int n){
		if (n <= 1) 
			return 1;
		else 
			return n*fact(n-1) ;
	}
	public static void main (String arg [ ])
	{
		int fact_a, fact_b, fact_c;
		int a = 4, b = 5, c = 6;
		LabU7Task3_1Fact f;
		f = new LabU7Task3_1Fact ( );
		fact_a = f.fact (a);
		fact_b =f.fact (b);
		fact_c = f.fact (c);
		System.out.println("Factorial of "+ a + " is " + fact_a);
		System.out.println ("Factorial of "+ b + " is "+ fact_b);
		System.out.println("Factorial of "+ c + " is "+ fact_c);
}
}