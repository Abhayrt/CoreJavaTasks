package lab_exercise_unit_5;

abstract class LabU5Task2Bike {
	 abstract void run();  
		}  
		class Honda4 extends LabU5Task2Bike{  
		void run(){
			System.out.println("running safely");
		} 
	public static void main(String args[]) {
		LabU5Task2Bike obj = new Honda4();  
		 obj.run();  
	}
}

