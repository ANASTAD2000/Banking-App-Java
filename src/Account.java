public abstract class Account {
    private String accountNumber;
    private double balance;
    private Client owner;

    // Constructor with parameters
    public Account() {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public abstract void displayAccountDetails();
}
