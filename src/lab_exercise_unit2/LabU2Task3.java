package lab_exercise_unit2;

import java.util.Scanner;

public class LabU2Task3 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n;
		n = sc1.nextInt();
		// Demonstrate a one-dimensional array.
		int[] arr = new int[n];
		// Length of an array
		System.out.println("Size of an Array  = " + arr.length);

		System.out.println("Enter the" + n + "Elements in  an Array");

		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
		}

		// Demonstrate a two-dimensional array
		System.out.println("2D array");
		int[][] arr2d = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				Scanner sc2 = new Scanner(System.in);
				arr2d[i][j] = sc2.nextInt();
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("2d array at pos "+i+" "+j+" "+arr2d[i][j]);
			}
		}

	// Demonstrate a multi-dimensional array.
		   int[][][] arr4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		   
	        for (int i = 0; i < 2; i++)
	           for (int j = 0; j < 2; j++)
	             for (int z = 0; z < 2; z++)
	                System.out.println("arr4[" + i+ "]["+ j + "]["+ z + "] = "+ arr4[i][j][z]);
	    
	}

}
