package lab_exercise_unit_6;

public interface LabU6Task3{
	
	public int square(int a);

}

class arithmetic implements LabU6Task3{
	int s = 0;
	public int square(int b)
	{
		System.out.println("implemented method square");
		System.out.println("Square of " + "is "+s);
		return s;
	}
	void arithmeth()
	{

		System.out.println("Inside method of  Arithmetic class");
	}
}

// use the object
class Test
{
public static void main(String a[]){
	System.out.println("calling from ToTestInt "); 
	
	LabU6Task3 t = new arithmetic();
t.square(10);
}
}
