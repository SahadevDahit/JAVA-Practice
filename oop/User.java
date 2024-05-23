package oop;
import java.time.LocalDate;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String password;
    private String role;
    private boolean status;
    private LocalDate dob; // Change Date to LocalDate

    // Default constructor
    public User() {}

    // Parameterized constructor (modify dob part)
    public User(String firstName, String middleName, String lastName, String address, String phone, String email, String password, String role, boolean status, LocalDate dob) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
        this.dob = dob;
    }

    // Getters and setters (modify for LocalDate)
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // ... other methods

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                ", dob=" + dob +
                '}';
    }

    public static void main(String[] args) {
        // Create a LocalDate object for the dob (Date of Birth)
        LocalDate dob = LocalDate.of(1990, 5, 15); // Year, Month, Day (Month is 1-based)

        // Create a User object using the parameterized constructor
        User user = new User(
                "Sahadev",
                "Middle",
                "Dahit",
                "123 Street, City",
                "+977 9865765419",
                "sahadevdahit123@gmail.com",
                "password123",
                "admin",
                true,
                dob
        );

        // Print the user object to verify its properties
        System.out.println(user);
    }

}
