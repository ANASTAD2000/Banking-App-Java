public class Main {
    public static void main(String[] args) {
        // Testing the Client class
        Client client1 = new Client(1, "John", "Doe", "john.doe@example.com", "123 Main St", "123-456-7890");

        // Display client details
        System.out.println("Client ID: " + client1.getId());
        System.out.println("First Name: " + client1.getFirstName());
        System.out.println("Last Name: " + client1.getLastName());
        System.out.println("Email: " + client1.getEmail());
        System.out.println("Address: " + client1.getAddress());
        System.out.println("Phone: " + client1.getPhone());

        // Update client details
        client1.setFirstName("Jane");
        client1.setLastName("Smith");

        // Display updated details
        System.out.println("\nUpdated First Name: " + client1.getFirstName());
        System.out.println("Updated Last Name: " + client1.getLastName());
    }
}
