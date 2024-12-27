public class SavingsAccount extends Account {

    // Instance variable for interest rate
    private double interestRate;

    // Constructor to initialize the savings account
    public SavingsAccount(String accountNumber, double balance, Client owner, double interestRate) {
        // Call the parent class (Account) constructor to initialize common attributes
        super(accountNumber, balance, owner);

        // Initialize the interestRate for the savings account
        this.interestRate = interestRate;
    }
    // Getter for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter for interestRate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Implement the abstract method from Account class
    @Override
    public void displayAccountDetails() {
        // Display account details
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Balance: " + getBalance());
        System.out.println("Account Owner: " + getOwner().getName());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

