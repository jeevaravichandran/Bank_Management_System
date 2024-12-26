import java.util.ArrayList;

public class Bank_Account {
	private String accHolderName; // accHolderName variable is used for store a account holder name
	private String accNumber; // accNumber is used for store a account number
	private double balance; // balance is used for store the balance amount for the account
	private ArrayList<String> statement; // to store a transaction history of the account

	Bank_Account(String accHolderName, String accNumber) { // constructor is used to initialize the variable value in
															// the Bank_Account class
		this.accHolderName = accHolderName;
		this.accNumber = accNumber;
		this.balance = 0.0; // initial balance is set to 0.0
		statement = new ArrayList<>(); // create a new ArrayList each account
	}

	public String getAccHolderName() { // return the account holder name
		return accHolderName;
	}

	public String getAccNumber() { // to return the account number
		return accNumber;
	}

	public double getBalance() { // to return the balance amount of the account
		return balance;
	}

	public void depositAmount(double amount) { // to add a deposit amount to the user account balance
		if (amount > 0) {
			balance += amount;
			statement.add("Amount credited: " + " +" + amount); // to store the deposit history of the transaction
		}
	}

	public boolean withdrawAmount(double amount) { // to subtract the withdrawn amount in the account balance and check
													// the amount is range between the balance amount of the account
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			statement.add("Amount debited: " + " -" + amount); // to store the withdrawn history of the transaction
			return true;
		}
		return false;
	}

	public void getAccountDetails(Bank_Account bc) { // to get the account details of the specific user
		System.out.println("----------*Account Details*----------");
		System.out.println();
		System.out.println("Account holder name: " + bc.accHolderName);
		System.out.println("Account Number: " + bc.accNumber);
		System.out.println("Available balance: " + bc.balance);
		System.out.println();
		System.out.println("----------*----------*----------");
	}

	public void getMiniStatement(Bank_Account bc) { // get the mini statement of the account it gives last five
													// transaction
		int lastFiveStatement = bc.statement.size() - 5;
		System.out.println("----------*Mini Statement*----------");
		System.out.println();
		System.out.print(
				"Account Holder Name: " + bc.accHolderName + "               " + "Account Number: " + bc.accNumber);
		System.out.println();
		System.out.println();
		if (lastFiveStatement <= 0) {
			for (String s : statement) {
				System.out.println(s);
			}
		} else {
			for (int i = lastFiveStatement; i < statement.size(); i++) {
				System.out.println(statement.get(i));
			}
		}

		System.out.println("Available balance: " + bc.getBalance());
		System.out.println();
		System.out.println("----------*----------*----------");
	}

	public void getFullStatement(Bank_Account bc) { // to get a entire transaction history of the specific account
		System.out.println("----------*Full Statement*----------");
		System.out.println();
		System.out.print(
				"Account Holder Name: " + bc.accHolderName + "               " + "Account Number: " + bc.accNumber);
		System.out.println();
		System.out.println();
		for (String s : bc.statement) {
			System.out.println(s);
		}
		System.out.println("Available balance: " + bc.getBalance());
		System.out.println();
		System.out.println("----------*----------*----------");
	}
}
