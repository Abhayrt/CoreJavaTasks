package lab_exercise_unit_9;




class OverloadDemo{
	void test(){
		System.out.println ("No parameters" );
	}
	void test (int a, int b){
		System.out.println ("a and b: " + a +" " + b);
	}
	void test (double a){
		System.out.println ("Inside test (double) a : " + a);
	}
	}
class Lab9Task1{
	public static void main (String args[]){
		OverloadDemo ob = new OverloadDemo();
		ob.test();
		ob.test(5);
		ob.test(10,20);
		ob.test(23,56);
}
}