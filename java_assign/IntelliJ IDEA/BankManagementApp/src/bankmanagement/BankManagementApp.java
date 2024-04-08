package bankmanagement;

import java.util.Scanner;

public class BankManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of the different account types
        SavingsAccount savingsAccount = new SavingsAccount("SA1001", "John Doe", 1000.0, 2.5);
        CurrentAccount currentAccount = new CurrentAccount("CA2001", "Jane Smith", 2000.0, 500.0);
        DematAccount dematAccount = new DematAccount("DA3001", "Bob Johnson", 3000.0, "DM1001");

        int choice;

        do {
            System.out.println("\nBank Account Management-Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Calculate Interest (Savings Account only)");
            System.out.println("5. Buy Stock (Demat Account only)");
            System.out.println("6. Sell Stock (Demat Account only)");
            System.out.println("0. Exit");

            System.out.print("Enter your own choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    savingsAccount.displayBalance();
                    break;
                case 4:
                    if (savingsAccount instanceof SavingsAccount) {
                        ((SavingsAccount) savingsAccount).calculateInterest();
                    } else {
                        System.out.println("Interest calculation is only applicable to Savings Account.");
                    }
                    break;
                case 5:
                    System.out.print("Enter stock name to buy: ");
                    String stockName = scanner.next();
                    System.out.print("Enter quantity to buy: ");
                    int quantityToBuy = scanner.nextInt();
                    dematAccount.buyStock(stockName, quantityToBuy);
                    break;
                case 6:
                    System.out.print("Enter stock name to sell: ");
                    String stockNameToSell = scanner.next();
                    System.out.print("Enter quantity to sell: ");
                    int quantityToSell = scanner.nextInt();
                    dematAccount.sellStock(stockNameToSell, quantityToSell);
                    break;
                case 0:
                    System.out.println("Exiting Bank Management Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 0);
    }
}


