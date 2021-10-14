package lab_exercise_unit_8;

	
class LabU8Task1{
	private int x;
	private int y;
	public LabU8Task1 (){
		
	}
	public  LabU8Task1 (int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY (int y){
		this.y = y;
	}
	public void setXY (int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX( ){
		return x;
	}
	public int gety ( ){
		return y;
	}
	public int addXY ( ){
		return (x + y);
	}
	public void display( ){
		System.out.println (x);
		System.out.println (y);
	}
	public double distance (LabU8Task1 p2){
		return Math.sqrt((x-p2.x)*(x-p2.x) + (y-p2.y)*(y-p2.y));
	}
	public static void main (String args[ ]){
		double a, b, c;
		LabU8Task1 op,op1,op2;
		op = new LabU8Task1(5, 6);
		op1 = new LabU8Task1();
		op2 = new LabU8Task1();
		op1.setX(3);
		op1.setY(6);
		op1.getX();
		op1.gety();
		op2.setXY(8,9);
		op2.addXY();
		a = op1.distance(op2);
		b = op2.distance(op);
		c = op.distance(op1);
		System.out.println("Distance between point op1 to op2 is "+a);
		System.out.println("Distance between point op2 to op is " +b);
		System.out.println("Distance between point op to op1 is " +c);
		System.out.println(" Points Of op, op1, op2");
		op.display();
		op1.display();
		op2.display();
	}
}