package Code_smells;
import java.util.ArrayList;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void sendEmail(String message) {
        // Sending email to the user...
        System.out.println("Sending email to " + username + " at " + email + ": " + message);
    }
}


