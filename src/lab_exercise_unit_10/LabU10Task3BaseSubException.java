/**
 * 
 */
package lab_exercise_unit_10;


import java.io.*;
	class LabU10Task3BaseSubException{
		public static void main(String a[]){
			if(a.length == 0){
				System.out.println("invalid usage");
				System.out.println("usage : Java file1 file2 file3 …");
				return;
			}
			for(int I=0;I<a.length; I++){
				File f = new File(a[I]);

				try {
					String line;
					DataInput d = new DataInputStream(new
							FileInputStream(a[I]));
					if (f.exists() && f.isFile())
					{
						System.out.println("file exists");
						System.out.println(f + "is ordinary file");
						System.out.println("printing the contents of file\r\n"	+ "named : " + a[I]);
						while((line = d.readLine()) != null){
							System.out.println(line);
						}
					}
				}
				catch(FileNotFoundException e){
					if(f.exists() && f.isDirectory()){
						System.out.println("======================");
						System.out.println("Name : “ + f + “is a directory");
						System.out.println("inside catch of FileNotFoundException");
						System.out.println("========================");
					}
					else {
						System.out.println("=====================");
						System.out.println("Name : " + a[I] + "does not exists");
						System.out.println("generated exception :"+e);
						System.out.println("======================");
				}
				} 
				catch(IOException p) {
					System.out.println("super class is higher up in the program");
			}
			}
		}
	}

