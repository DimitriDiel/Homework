package lesson35.task3;

public class User {

    private String username;
    private int identifier;
    private String firstName;
    private String lastName;

    public User(String username, int identifier, String firstName, String lastName) {
        this.username = username;
        this.identifier = identifier;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", identifier=" + identifier +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
