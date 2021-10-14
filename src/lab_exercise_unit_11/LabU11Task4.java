package lab_exercise_unit_11;



import java.io.*;
class LabU11Task4{
	public static void main(String a[])throws IOException
	{
		Runtime r;
		r = Runtime.getRuntime();
		System.out.println(r.freeMemory());
		int x[] = {1};
		r.gc();
		System.out.println(r.freeMemory());
		Process p = r.exec("pbrush.exe");
		System.out.println(r.freeMemory());
	}
	}