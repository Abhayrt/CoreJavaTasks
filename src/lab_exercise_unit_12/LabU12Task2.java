package lab_exercise_unit_12;

import java.io.*;

class LabU12Task2 {
	public static void main(String args[]) throws Exception {
		ByteArrayOutputStream f = new ByteArrayOutputStream(12);
		System.out.println("enter 10 characters");
		while (f.size() != 10) {
			f.write(System.in.read());
		}
		System.out.println("Accepted characters into an array");
		byte b[] = f.toByteArray();

		
		ByteArrayInputStream inp = new ByteArrayInputStream(b);
		int c;
		System.out.println("converted to upper case characters");
		for (int i = 0; i < 1; i++) {
			while ((c = inp.read()) != -1) {
				System.out.print(Character.toUpperCase((char) c));
			}
			System.out.println();
			inp.reset();
		}
	}
}