package lab_exercise_unit_12;

import java.io.FileOutputStream;

public class LabU12Task {

	public static void main(String[] args) {
		   
	           try{    
	             FileOutputStream fout=new FileOutputStream("SmpleFolder/testout.txt");    
	             fout.write(65);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	}

}
