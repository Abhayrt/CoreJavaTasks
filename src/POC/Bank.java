package POC;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bank {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.Menu();
	}

}

class BankAccount {
	int Balance;
	int amt;
	String CustName;
	String Custaddress;
	String CustContact;
	String username;
	String password;
	String payeeUn;
	int payeeamount;

	void Deposit(int amount) {
		if (amount > 0) {
			Balance = Balance + amount;
		}
	}

	void Transfer(int amount) {
		if (amount > 0) {
			Balance = Balance - amount;
		}
	}

	void Transaction() {
		System.out.println("Previous transation under progress");
	}

	void RegisterAc() {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name : ");
		CustName = s1.next();
		System.out.println("Enter address : ");
		Custaddress = s1.next();
		while(!Custaddress.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
			System.out.println("Invalid EmailId! Try again!");
			System.out.print("Enter Email :");
			Custaddress = s1.next();
		}
		
		System.out.println("Enter contact number :");
		CustContact = s1.next();
		while(!CustContact.matches("[7-9][0-9]{9}")) {
			System.out.println("Invalid Mobile Number!");
			System.out.print("Enter Mobile:");
			CustContact = s1.next();
		}
		
		System.out.println("Set Username:");
		System.out.println("\n");
		username = s1.next();
		System.out.println(
				"Set a password (minimum 8 chars; minimum 1 digit, 1 lowercase, 1  uppercase, 1 special character[!@#$%^&*_]) :");
		System.out.println("\n");
		password = s1.next();
		
//		while(!password.matches("(.*[0-9]).{8, })")) {
//			System.out.println("Invalid Password Number!");
//			System.out.print("Enter password Again:");
//			password = s1.nextLine();
//		}
		System.out.println("Enter initial deposit : ");
		amt = s1.nextInt();
		Deposit(amt);

	}

	void Login() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter username : ");
		String enterusername = s2.next();
		System.out.println("Enter password :");
		String enteredpwd = s2.next();
		if(enterusername.equals(username)  && enteredpwd.equals(password) ) {
			
		 System.out.println("Loged in Successfully....");
			int n2;
			do {
				System.out.println("------------------------------------");
				System.out.println("          W E L C O M E   ");
				System.out.println("------------------------------------");
				System.out.println("1. Deposit.");
				System.out.println("2. Transfer.");
				System.out.println("3. Last 5 transactions.");
				System.out.println("4. User information.");
				System.out.println("5. Log out.");
				System.out.println("\n");
				System.out.println("Enter Your Choice:");
				n2 = s2.nextInt();
				switch (n2) {
				case 1:
					System.out.println("Enter amount : ");
					amt = s2.nextInt();
					Deposit(amt);
					break;
				case 2:
					System.out.println("Enter payee username");
					payeeUn = s2.next();
					System.out.println("Enter Amount :");
					payeeamount = s2.nextInt();
					if (this.payeeUn == payeeUn) {
						Transfer(payeeamount);
					} else {
						System.out.println("Payeee Dosn't exist");
					}
					break;
				case 3:

					break;
				case 4:
					System.out.println("Accountholder name :" + CustName);
					System.out.println("Accountholder address :" + Custaddress);
					System.out.println("Accountholder contact : " + CustContact);
					System.out.println("acc bal:"+Balance);
					break;
				case 5:
					System.out.println("Loged Out successfully..");
					break;
				default:
					System.out.println("Invalid Input ");

				}

			} while (n2 != 5);
			System.out.println(" You are  Logged Out............");
		}
		else {
			System.out.println("Invalid uver name and password !");
			System.out.print("Enter username and password Again:");
			System.out.println("Enter username Again: ");
			enterusername = s2.next();
			System.out.println("Enter password Again:");
			enteredpwd = s2.next();
		}
	}

	void Menu() {

		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("------------------------------------");
			System.out.println("        BANK Of MYBANK          ");
			System.out.println("------------------------------------");
			System.out.println("1. Register account");
			System.out.println("2. Login.");
			System.out.println("3. Update accounts.");
			System.out.println("4. Exit.");
			System.out.println("\n");
			System.out.println("Enter Your Choice:");
			n = sc.nextInt();

			switch (n) {
			case 1:
				RegisterAc();
				break;
			case 2:
				Login();
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Input Is  Invalid");
			}

		} while (n != 4);
		System.out.println("----------------Thank You Visit Again-----------------");
	}
}
