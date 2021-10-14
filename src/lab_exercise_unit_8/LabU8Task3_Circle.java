package lab_exercise_unit_8;
//package MyPack;



	class LabU8Task3_Circle{
		double r;
		void area(){
			System.out.println("Area of the circle = " + (3.14 * r * r));
		}
	}
	class Square{
		double s;
		void area(){
			System.out.println("Area of the Square = " + (s * s));
		}
	}
	class Rectangle{
		double l,b;
		void area(){
			System.out.println("Area of the circle = " + (l * b));
		}
	}
//implements the package
//	import MyPack.Circle;
	class Eg{
		public static void main(String a[]){
			LabU8Task3_Circle c = new LabU8Task3_Circle();
			c.area();
		}
	}

