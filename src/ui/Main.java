package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	private Scanner dataReader;
	
	public Main() {
		dataReader = new Scanner(System.in);
	}
	
	public Scanner getDataReader() {
		return dataReader;
	}
	
	public void menu() {
		int options = 0;
		do {
			try {
				System.out.println();
				System.out.println("Welcome to the menu.");
				System.out.println("Enter the option that you want.");
				System.out.println("0. Exit");
				System.out.println("1. Add Employee.");
				System.out.println("2. Search Employee.");
				System.out.println("3. Show Employees tree.");
				System.out.println("4. Minimum.");
				System.out.println("5. Maximum.");
				System.out.println("6. Delete Employee.");
				System.out.println("7. Tree weight.");
				System.out.println("8. List elements in PreOrder.");
				System.out.println("9. List elements in InOrder.");
				System.out.println("10. List elements in PostOrder.");
				System.out.println();
				options = dataReader.nextInt();
				dataReader.nextLine();
				switch( options ) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
					default:
						if( options != 0 ) {
							System.out.println("Enter a valid option.");
						}else {
							System.out.println("Thanks for using the program.");
						}
						break;
				}
			}catch( InputMismatchException e ) {
				System.out.println("Enter a valid option.");
			}
		}while( options != 0 );
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.menu();
		m.getDataReader().close();
	}

}
