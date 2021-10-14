package lab_exercise_unit2;

public class LabtU2Task1 {

	public static void main(String[] args) {

		// inr and Dcr Operators
		int i = 1;
		// int j=i++;
		int j = ++i;
		System.out.println(j);
		int a = 2;
		// int b=--a;
		int b = a--;
		System.out.println(b);

		// Bitwise operators
		// AND &
		int c = 10;
		int d = 5;
		int e = 20;
		System.out.println(c < e & c < d);
		// OR |
		System.out.println(c > d | c++ < e);// true|true
		// bitwise complement operator ~
		int f = ~e;
		System.out.println(f);
		// arithmetic operator
		int a1 = 10;
		int a2 = 2;

		System.out.println("Addition" + (a1 + a2));
		System.out.println("Substraction " + (a1 - a2));
		System.out.println("Multiplication" + (a1 * a2));
		System.out.println("Division" + (a1 / a2));
		System.out.println("Modulas" + (a1 % a2));

//relational and conditional  Operator 
        int b1=10;
        int b2=20;
        int b3=10;
        if(b2>=b1)
           System.out.println(b2+"is graeter than b1");
        else 
        	System.out.println(b1+"is graeter than b2");
        if(b1==b3)
        	System.out.println(b1+"and "+b3+"Are equal");
        
	}
	

}
