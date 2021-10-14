package lab_exercise_unit2;

import java.util.Scanner;

public class LabU2Task2 {

	public static void main(String[] args) {
		// if statement
		int a = 10, b = 20;
		if (a > b) {
			System.out.println("A is greater");
		} else {
			System.out.println("Bis greater");
		}

		// Switch Statement
		System.out.println("Enter the number for days of week");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("INVALID input ");

		}

		// for loop
		System.out.println("===============");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		//While Loop
		System.out.println("======Whiile loop=========");
		int num=5;
		while(num!=0) {
			System.out.println(num);
			num--;
		}
		//Do statement
		int num1=5;
		System.out.println("======Do Whiile loop=========");
		do{
			System.out.println(num1);
			num1--;
		}
		while(num1!=0);
		
	
	}
}
