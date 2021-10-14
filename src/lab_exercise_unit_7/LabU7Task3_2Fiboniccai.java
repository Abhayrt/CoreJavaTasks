package lab_exercise_unit_7;


public class LabU7Task3_2Fiboniccai{
	long fibo (int n){
		if (n <= 1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	public static void main (String args [ ]){
	LabU7Task3_2Fiboniccai f;
	long l;
	f = new LabU7Task3_2Fiboniccai ( );
	l = f.fibo (5);
	System.out.println ("5th fibonacci number is "+l);

	}
	}
