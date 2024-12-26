# Bank Management System

A console-based Java application designed to manage basic banking operations. This project demonstrates core Java concepts, object-oriented programming (OOP) principles, and logical problem-solving skills.

## Features

The application supports the following features:
1. **Create Account**: Allows users to create a new bank account with a unique account number.
2. **Deposit Amount**: Enables users to deposit money into their account.
3. **Withdraw Amount**: Allows users to withdraw money, ensuring sufficient balance.
4. **Check Balance**: Displays the current balance of a user's account.
5. **Account Details**: Provides the account holder's details, including balance and account number.
6. **Mini Statement**: Shows the last five transactions of an account.
7. **Full Statement**: Displays the complete transaction history of an account.
8. **Exit**: Exits the application.

## Technologies Used

- Programming Language: Java
- Collections: `HashMap`, `ArrayList`
- Input Handling: `Scanner`

## How It Works

The application uses a `Bank_Manager` class to manage multiple bank accounts and provides options for performing banking operations through a menu-driven interface. Each account is represented by an instance of the `Bank_Account` class.

### Class Descriptions

- **Bank_Application_Form**: Contains the main method and user interface.
- **Bank_Manager**: Handles account creation and operations such as deposit, withdrawal, and balance inquiry.
- **Bank_Account**: Stores account details and manages transactions.

## Installation and Usage

1. Clone this repository to your local machine.
    ```bash
    git clone https://github.com/jeevaravichandran/Bank_Management_System.git
    ```
2. Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ IDEA).
3. Run the `Bank_Application_Form` class to start the application.
4. Follow the on-screen instructions to interact with the system.

## Example Usage

1. **Create Account**: 
    ```
    Enter Account holder name: John Doe
    Enter Account number: 12345
    Account created successfully!!!
    ```
2. **Deposit Amount**:
    ```
    Enter account number: 12345
    Enter deposit amount: 5000
    Amount deposited successfully!!!
    ```
3. **Check Balance**:
    ```
    Enter account number: 12345
    Available balance: $ 5000
    ```

## Future Enhancements

- Implement a graphical user interface (GUI) for better usability.
- Add security features such as account passwords.
- Introduce database integration to store account details persistently.

## Why This Project?

This project showcases:
- Proficiency in Java and OOP concepts.
- Logical thinking and problem-solving skills.
- Familiarity with basic data structures like `HashMap` and `ArrayList`.
- Understanding of menu-driven programming and user input handling.

## Author

- Jeeva Ravichandran: Aspiring Java Developer with a passion for solving problems using technology.

## License

This project is open-source and available under the [MIT License](LICENSE).

---
