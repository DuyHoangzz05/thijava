import java.util.Scanner;

class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize with default values
    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    // Getters and setters for all fields
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display detailed account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful.");
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    // Method to transfer money from one account to another
    public void transfer(AccountBank destinationAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                destinationAccount.deposit(amount);
                System.out.println("Transfer of $" + amount + " successful.");
            } else {
                System.out.println("Insufficient balance for transfer.");
            }
        } else {
            System.out.println("Invalid amount for transfer.");
        }
    }
}
