package library;

public class Contact {

    private final String phoneNumber;

    private final String email;

    public Contact(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "phone: " + phoneNumber + " | email: " + email;
    }
}
