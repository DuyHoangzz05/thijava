import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create new account
        AccountBank account1 = new AccountBank();

        // Enter account information
        System.out.print("Enter account number: ");
        account1.setAccountNumber(scanner.nextLine());

        System.out.print("Enter account holder name: ");
        account1.setAccountHolderName(scanner.nextLine());

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        account1.setBalance(initialBalance);

        // Display account information
        System.out.println("\nAccount Information:");
        account1.displayAccountInfo();

        // Perform transactions
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);
        account1.displayAccountInfo();

        System.out.print("\nEnter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        account1.withdraw(withdrawAmount);
        account1.displayAccountInfo();

        // Create another account for transfer
        AccountBank account2 = new AccountBank();
        account2.setAccountNumber("123456789");
        account2.setAccountHolderName("Recipient");
        account2.setBalance(0);

        System.out.print("\nEnter transfer amount: ");
        double transferAmount = scanner.nextDouble();
        account1.transfer(account2, transferAmount);

        // Display updated account information
        System.out.println("\nUpdated Account Information:");
        account1.displayAccountInfo();
        System.out.println("\nRecipient Account Information:");
        account2.displayAccountInfo();

        scanner.close();
    }
}


