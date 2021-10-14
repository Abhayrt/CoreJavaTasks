package lab_exercise_unit_4;

public class LabU4Task4Vehicle {
	void run(){
		System.out.println("Vehicle is running");}  
		}  

class Bike extends LabU4Task4Vehicle{  
	
	void run(){
	System.out.println("Bike is running safely");
	}  
	public static void main(String args[]) {
		Bike obj=new Bike();
		obj.run();
		
	}
}
