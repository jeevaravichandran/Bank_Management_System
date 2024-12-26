import java.util.Scanner;

public class Bank_Application_Form {

	public static void main(String[] args) {

		Bank_Manager manager = new Bank_Manager(); // Bank_Manager class object is created  for accessing the bank account
		Scanner scan = new Scanner(System.in);
		int userOption = 0;

		while (true) {
			System.out.println("------------ *Bank management system* ------------"); // available option in the bank
																						// management system
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Check Balance");
			System.out.println("5. Account Details");
			System.out.println("6. Mini Statement");
			System.out.println("7. Full Statement");
			System.out.println("8. Exit");
			System.out.println("------------ * ------------ * ------------");
			System.out.println("Choose an option: ");

			userOption = scan.nextInt(); // to read the user input option
			scan.nextLine();

			switch (userOption) { // switch case is used for the executing the user option
			case 1:
				manager.createAccount(scan); // case 1 is used to invoke the createAccount method
				break;
			case 2:
				manager.depositAmount(scan); // case 2 is used to invoke the depositAmount method
				break;
			case 3:
				manager.withdrawAmount(scan); // case 3 is used to invoke the withdrawAmount method
				break;
			case 4:
				manager.checkBalance(scan); // case 4 is used to invoke the checkBalance method
				break;
			case 5:
				manager.accountDetails(scan); // case 5 is used to invoke the accountDetails method
				break;
			case 6:
				manager.getMiniStatement(scan); // case 6 is used to invoke the getMiniStatement method
				break;
			case 7:
				manager.getFullStatement(scan); // case 7 is used to invoke the getFullStatement method
				break;
			case 8:
				System.out.println("Visit again, Thank You!!!"); // case 8 is used for exit the program to stop the
																	// infinite while loop
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option, choose the available option only"); // default is used for the
																						// default function when user
																						// doesn't choose any available
																						// option

			}
		}

	}
}
