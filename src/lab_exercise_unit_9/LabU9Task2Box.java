package lab_exercise_unit_9;



class LabU9Task2Box{
	private int length;
	private int breadth;
	public LabU9Task2Box ( ){
		length =0;
		breadth =0;
	}
	public LabU9Task2Box (int x, int y){
		length = x;
		breadth =y;
	}
	public void setval (int x, int y){
		length = x;
		breadth = y;
		}
	public int area ( ){
		return (length * breadth);
	}
	}
	class Box3d extends LabU9Task2Box{
		private int height;
		public Box3d ( ){
			super ( );
			height = 0;
		}
		public Box3d(int x, int y, int z){
			super (x, y);
			height = z;
		}
		public void setval (int x, int y, int z){
			super.setval(x, y);
			height = z;
		}
		public int volume ( ){
			return (super.area ( ) * height );
		}
		public static void main(String arga [ ]){
			LabU9Task2Box b1 = new LabU9Task2Box ( );
			Box3d b2 = new Box3d(12,34,18);
			b1.setval (25,30);

			System.out.println ("The area of b1 is : " + b1.area( ) );
			System.out.println (""+ b2.volume ( ));
		}
	}

