package lab_exercise_unit_5;

class Circle {
	  public void draw() {
	    System.out.println("I am draw method in class Circle  ");
	  }
	  public void erase() {
		  System.out.println("I am erase method in class Circle");
	}
	}
	class Triangle {
		  public void draw() {
			    System.out.println("I am draw method in class Triangle  ");
			  }
			  public void erase() {
				  System.out.println("I am erase method in class Triangle");
			}
	}
	class Square {
		public void draw() {
		    System.out.println("I am draw method in class Square  ");
		  }
		  public void erase() {
			  System.out.println("I am erase method in class Square");
		}
	}
public class LabU5Task1Shape {
	
	public static void main(String[] args) {
		
		Circle circleObj=new Circle();
		Triangle triangleObj=new Triangle();
		Square squareObj=new Square();
		circleObj.draw();
		circleObj.erase();
		triangleObj.draw();
		triangleObj.erase();
		squareObj.draw();
		squareObj.erase();
		
		
	}
}
