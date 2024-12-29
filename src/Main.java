import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Sample menu options
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to display the menu until the user chooses to exit
        do {
            System.out.println("\n--- Bank App Menu ---");
            System.out.println("1. Manage Clients");
            System.out.println("2. Manage Accounts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageClients(scanner); // Manage clients
                    break;
                case 2:
                    manageAccounts(scanner); // Manage accounts
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); // Exit the loop if the user selects "Exit"
    }

    // Method to manage clients
    public static void manageClients(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Manage Clients ---");
            System.out.println("1. Add New Client");
            System.out.println("2. Display All Clients");
            System.out.println("3. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addClient(scanner); // Add a new client
                    break;
                case 2:
                    Client.displayAllClients(); // Display all clients
                    break;
                case 3:
                    System.out.println("Going back to the main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); // Go back to the main menu
    }

    // Method to manage accounts
    public static void manageAccounts(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--- Manage Accounts ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Go Back");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    createNewAccount(scanner); // Create a new account
                    break;
                case 2:
                    displayAllAccounts(); // Display all accounts
                    break;
                case 3:
                    System.out.println("Going back to the main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3); // Go back to the main menu
    }

    // Method to create a new account
    public static void createNewAccount(Scanner scanner) {
        System.out.println("Enter Account Type (1: Current, 2: Savings): ");
        int accountType = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter Client Name: ");
        String clientName = scanner.nextLine();

        Client client = Client.findClientByName(clientName); // Find the client by name
        if (client != null) {
            if (accountType == 1) {
                System.out.println("Creating Current Account...");
                new CurrentAccount(accountNumber, balance, client); // Create a current account
            } else if (accountType == 2) {
                System.out.println("Enter Interest Rate: ");
                double interestRate = scanner.nextDouble();
                new SavingsAccount(accountNumber, balance, client, interestRate); // Create a savings account
            } else {
                System.out.println("Invalid account type.");
            }
        } else {
            System.out.println("Client not found.");
        }
    }

    // Method to display all accounts (both current and savings)
    public static void displayAllAccounts() {
        System.out.println("\n--- Display All Accounts ---");
        if (CurrentAccount.currentAccounts.isEmpty() && SavingsAccount.savingsAccounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            // Display all current accounts
            for (CurrentAccount currentAccount : CurrentAccount.currentAccounts) {
                currentAccount.displayAccountDetails();
            }
            // Display all savings accounts
            for (SavingsAccount savingsAccount : SavingsAccount.savingsAccounts) {
                savingsAccount.displayAccountDetails();
            }
        }
    }

    // Method to add a new client
    public static void addClient(Scanner scanner) {
        System.out.println("Enter Client ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter Client First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Client Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter Client Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Client Address: ");
        String address = scanner.nextLine();

        System.out.println("Enter Client Phone Number: ");
        String phoneNumber = scanner.nextLine();

        Client newClient = new Client(id, firstName, lastName, email, address, phoneNumber); // Create a new client
        Client.clientList.add(newClient);
        System.out.println("Client added successfully!");
    }
}
