package homeser;

import java.util.Scanner;
import java.sql.*;

public class Homeser {

	public static void main(String[] args) throws SQLException {
		
		String s = "y";
		String usern, passw;
	outer:	while (true) {

			Scanner sc1 = new Scanner(System.in);
			System.out.println("........ WELCOME TO HOME TECHNICIAN AND SERVICES............");

			System.out.println("Please Enter The LOGIN DETAILS:");

			System.out.println("enter username: ");
			usern = sc1.nextLine();
			System.out.println("Enter your password: ");
			passw = sc1.nextLine();

			
			if (usern.equals("Pranay") && passw.equals("tiwari")) {
				System.out.println("your authentication is succefull");

				while (s.equals("y")) {
					System.out.println("SERVICES PROVIDED BY US");
					System.out.println("press 1 to choose AC_REPAIR");
					System.out.println("press 2 to choose CLEANING");
					System.out.println("press 3 to choose PLUMBER");
					System.out.println("press 4 to choose EXIT");

					Scanner sc = new Scanner(System.in);
					int i = sc.nextInt();

					booking bb = new booking();

					switch (i) {
					case 1:
						bb.Ac_repair();
						break;
					case 2:
						bb.Cleaning();
						break;
					case 3:
						bb.Plumber();
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("Wrong Choice");
						break;
					}
					System.out.println("want to continue press y/n");
					s = sc.next();
					if (s.equals("n")) {
				         break outer ; 
					}
				}
			} else {
				System.out.println("INVALID. Please Enter Correct Details: ");
				//System.out.println("want to continue press y/n");
			//	p = sc1.next();
			}
			
		}

	}
}
