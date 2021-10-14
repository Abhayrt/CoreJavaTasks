package lab_exercise_unit_12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class LabU12Task3 {

	public static void main(String[] args) throws IOException {
		
		File file1=new File("SmpleFolder/sample.txt");
		BufferedWriter br=new BufferedWriter(new FileWriter(file1,true));
        br.newLine();
		br.write("Hello NeoSOFT");
        br.close();
	}

}


