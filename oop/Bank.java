package oop;

public class Bank {
    private String name;
    private String address;
    private String location;
    private String contact;
    private String email;
    private String branch;

    // Default constructor
    public Bank() {}

    // Parameterized constructor
    public Bank(String name, String address, String location, String contact, String email, String branch) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.contact = contact;
        this.email = email;
        this.branch = branch;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
    public static void main(String[] args) {
        // Create a Bank object using the parameterized constructor
        Bank bank = new Bank(
            "Example Bank",            // name
            "123 Main Street",         // address
            "City Center",             // location
            "+1234567890",             // contact
            "info@examplebank.com",    // email
            "City Center Branch"       // branch
        );

        // Print the bank object to verify its properties
        System.out.println(bank);
    }
}
