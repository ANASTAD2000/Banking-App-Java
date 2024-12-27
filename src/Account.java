// Declaration of the Account class
public abstract class Account {
    // Attributes (properties)
    private String accountNumber;  // Unique account number
    private double balance;        // Current balance
    private Client owner; // Reference to the account owner (Client object)

    // Constructor
    public Account(String accountNumber, double balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }



}


