import java.util.HashMap;
import java.util.Scanner;

public class Bank_Manager {
	private HashMap<String, Bank_Account> accounts; // HashMap is used to maintain the accounts of the users in the bank

	Bank_Manager() {
		accounts = new HashMap<>(); // new HashMap created and maintained by the manager in each Bank_Manager object
									// is created
	}

	public void createAccount(Scanner scan) { // to create the account for the new user of the bank by the manager it
												// maintains by the manager
		System.out.println("Enter Account holder name: ");
		String name = scan.nextLine();
		System.out.println("Enter Account number: ");
		String number = scan.nextLine();

		if (accounts.containsKey(number)) {
			System.out.println("Account number already exists, please try again"); // to check the account number
																					// already exists in the bank
			return;
		}

		Bank_Account account = new Bank_Account(name, number); // to create a new account
		accounts.put(number, account); // to add the new user account details to the HashMap
		System.out.println("Account created successfully!!!"); // print the new account created message for the user
																// clarification
	}

	public void depositAmount(Scanner scan) { // to deposit the amount to the specific account by the manager
		System.out.println("Enter account number: ");
		String number = scan.nextLine(); // to get the account number to the account holder

		Bank_Account account = accounts.get(number); // to get the account details by the account number
		if (account == null) { // if the account will be null it through the error message
			System.out.println("Invalid account, Account not found");
			return;
		}

		System.out.println("Enter deposit amount: ");
		double amount = scan.nextDouble(); // to get the deposit amount the user
		scan.nextLine();

		if (amount <= 0) { // to check the deposit amount valid or not if it negative value it through the
							// error message
			System.out.println("Invalid amount");
			return;
		}
		account.depositAmount(amount); // to call the depositAmount amount method in the account class to maintain the
										// account balance
		System.out.println("Amount deposited successfully!!!");

	}

	public void withdrawAmount(Scanner scan) { // to withdraw the amount to the specific account by the manager
		System.out.println("Enter account number ");
		String number = scan.nextLine(); // to get the account number to the account holder

		Bank_Account account = accounts.get(number); // to get the account details by the account number

		if (account == null) { // if the account will be null it through the error message
			System.out.println("Account not found");
			return;
		}

		System.out.println("Enter withdraw amount: ");
		double amount = scan.nextDouble(); // to get the deposit amount the user
		scan.nextLine();

		if (account.withdrawAmount(amount)) {
			System.out.println("Amount withdrawn successfully!!!");
		} else {
			System.out.println("Insufficient amount or Invalid amount");
		}

	}

	public void checkBalance(Scanner scan) { // to check the balance amount of the specific account
		System.out.println("Enter account number ");
		String number = scan.nextLine(); // to get the account number the the user

		Bank_Account account = accounts.get(number); // to check the account number is available in the accounts

		if (account == null) { // if the account number is not available in the accounts it through the error
								// message
			System.out.println("Account not found");
			return;
		}

		System.out.println("Available balance: $ " + account.getBalance()); // to get the available balance of the
																			// specific account
	}

	public void accountDetails(Scanner scan) { // to get the account Details
		System.out.println("Enter account number ");
		String number = scan.nextLine(); // to get the account number to the user

		Bank_Account account = accounts.get(number); // to check the account number is available in the accounts list

		if (account == null) { // if the account number is not available in the accounts it through the error
								// message
			System.out.println("Account not found");
			return;
		}

		account.getAccountDetails(account); // to get the account details of the specific account
	}

	public void getMiniStatement(Scanner scan) { // to get the mini statement of the account
		System.out.println("Enter account number ");
		String number = scan.nextLine(); // to get the account number to the user

		Bank_Account account = accounts.get(number); // to check the account number is available in the accounts list

		if (account == null) { // if the account number is not available in the accounts it through the error
								// message
			System.out.println("Account not found");
			return;
		}

		account.getMiniStatement(account); // to get the mini statement of the specific account it returns only last
											// five transactions
	}

	public void getFullStatement(Scanner scan) { // to get the full statement of the account
		System.out.println("Enter account number ");
		String number = scan.nextLine(); // to get the account number to the user

		Bank_Account account = accounts.get(number); // to check the account number is available in the accounts list

		if (account == null) { // if the account number is not available in the accounts it through the error
								// message
			System.out.println("Account not found");
			return;
		}

		account.getFullStatement(account); // to get the full statement of the specific account it returns entire
											// transaction history of the account
	}
}
