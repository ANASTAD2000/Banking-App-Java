import java.util.ArrayList;

public class SavingsAccount extends Account {
    private double interestRate;
    public static ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>(); // To store all savings accounts

    // Constructor to initialize the savings account
    public SavingsAccount(String accountNumber, double balance, Client owner, double interestRate) {
        super();
        this.interestRate = interestRate;
        savingsAccounts.add(this); // Add this account to the list of savings accounts
    }

    // Getter and setter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Implement abstract method to display account details
    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Owner: " + getOwner().getFirstName() + " " + getOwner().getLastName());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
