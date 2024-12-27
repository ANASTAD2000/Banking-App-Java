public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    // Constructor and other methods...

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // If you want to get the full name, you can create a getName() method
    public String getName() {
        return firstName + " " + lastName;  // Concatenate first and last name
    }
}
