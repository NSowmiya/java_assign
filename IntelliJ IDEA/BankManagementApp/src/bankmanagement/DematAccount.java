package bankmanagement;

public class DematAccount extends BankAccount {
    private String dematNumber;

    public DematAccount(String accountNumber, String accountHolderName, double balance, String dematNumber) {
        super(accountNumber, accountHolderName, balance);
        this.dematNumber = dematNumber;
    }

    public void buyStock(String stockName, int quantity) {
        double cost = quantity * 10; // Assuming the cost per stock is $10
        if (cost <= getBalance()) {
            withdraw(cost);
            System.out.println(quantity + " stocks of " + stockName + " bought successfully.");
        } else {
            System.out.println("Insufficient funds to buy stocks.");
        }
    }

    public void sellStock(String stockName, int quantity) {
        double proceeds = quantity * 8; // Assuming the selling price per stock is $8
        deposit(proceeds);
        System.out.println(quantity + " stocks of " + stockName + " sold successfully.");
    }
}
