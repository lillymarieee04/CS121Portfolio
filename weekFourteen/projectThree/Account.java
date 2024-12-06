package weekFourteen.projectThree;

import java.text.DecimalFormat;

public class Account {
    private static int numberOfAccounts = 1000; //keeps track of the number of Accounts created
    private int accountNumber;
    private double balance;

    //constructor parameter
    public Account(double initialDeposit) {
        this.balance = initialDeposit;
        this.accountNumber = ++numberOfAccounts; //incrementing accounts
    }   //:)

    //methods
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + format(amount) + ", New Balance: $" + format(balance));
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Current Balance: $" + format(balance));
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + format(amount) + ", New Balance: $" + format(balance));
        }
    } //hi :) hope you're doing well!

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override

    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + format(balance);
    }

    private String format(double amount) {
        return new DecimalFormat("0.00").format(amount);
    }
}
