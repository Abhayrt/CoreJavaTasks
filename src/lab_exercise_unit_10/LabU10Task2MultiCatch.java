package lab_exercise_unit_10;


import java.io.*;
class LabU10Task2MultiCatch{
	public static void main( String a[]){
		int a1[] = { 100,200,300,400,500 };
		System.out.println("enter a number as array index and find out its value");
		System.out.println("enter and to come out of the programs");
		try{
			String line;
			int x;
			BufferedReader d = new BufferedReader( new
					InputStreamReader(System.in));
			while (( line = d.readLine()) != null){
				if (line.equals("end"))
					break;
				else {
					try {
						x = Integer.parseInt(line);
						System.out.println("valid element and it is : "+a1[x]);
					}
					catch(ArrayIndexOutOfBoundsException e){
						System.out.println("invalid elements ");
						System.out.println("exception generated : "+e);
					}
					catch(NumberFormatException n){
						System.out.println("sorry no characters");
						System.out.println("generated exception : " + n);
					}
				}
			}
		}catch(IOException i){
			
		}
	}
	}