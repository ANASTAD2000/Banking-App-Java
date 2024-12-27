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


