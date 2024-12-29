import java.util.ArrayList;

public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    // List to store clients
    public static ArrayList<Client> clientList = new ArrayList<>();

    // Constructor to initialize client details
    public Client(int id, String firstName, String lastName, String email, String address, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Client() {

    }


    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getName() {
        return firstName + " " + lastName;
    }

    // Method to display client details
    public void displayClientDetails() {
        System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email +
                ", Address: " + address + ", Phone: " + phoneNumber);
    }

    // Method to find a client by name
    public static Client findClientByName(String name) {
        for (Client client : clientList) {
            if (client.firstName.equalsIgnoreCase(name) || client.lastName.equalsIgnoreCase(name)) {
                return client;
            }
        }
        return null; // Return null if client not found
    }

    // Method to display all clients
    public static void displayAllClients() {
        if (clientList.isEmpty()) {
            System.out.println("No clients available.");
        } else {
            for (Client client : clientList) {
                client.displayClientDetails();
            }
        }
    }
}
