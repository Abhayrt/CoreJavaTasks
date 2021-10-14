package lab_exercise_unit_10;




import java.io.*;

class LabU10Task6UserDefined extends Exception{
	private int a;
	LabU10Task6UserDefined(int b){
		a = b;
	}
	public String toString(){
		return "_10_6_userDefined [ " + a + "]";
	}
	}
	class UserdefException{
		public int x;
		final int k = 5;
		void getInt(){
			try {
				BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("do some guess work to generate your own exception ");
				System.out.println("enter a number between 1 and 10");
				System.out.println("between these numbers lies the number to generate your own exception ");
				String line;
				while((line = d.readLine()) != null){
					x = Integer.parseInt(line);
					if ( x == 5){
						System.out.println(" congrats ! you have generated an exception !");
						throw new LabU10Task6UserDefined(x);
					}
					else
						System.out.println("Wrong guess ! try again");
					continue;
				}
			} 
			catch(LabU10Task6UserDefined m) {
				System.out.println("Generated exception: " +m);
			} 
			catch(NumberFormatException n){
				System.out.println("sorry ! no characters");
				System.out.println("Exiting …");
				System.out.println("Generated exception :"+n);
			}
			catch(IOException e) { }
		}
		public static void main(String a[]) {
			UserdefException u = new UserdefException();
			u.getInt();
		}
	}