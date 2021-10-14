package lab_exercise_unit_6;

interface AnimalEat {
	   void eat();
	}
	interface AnimalTravel {
	   void travel();
	}
	class Animal implements AnimalEat, AnimalTravel {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}
	public class LabU6Task2 {
	   public static void main(String args[]) {
	      Animal a = new Animal();
	      a.eat();
	      a.travel();
	   }
	}