package Code_smells;

import java.util.ArrayList;

public class UserListProcessor {
    private ArrayList<User> users;

    public UserListProcessor(ArrayList<User> users) {
        this.users = users;
    }

    public void processUsers() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        // Processing user...
        System.out.println("Processing user: " + user.getUsername());
        if (user.getUsername().contains("admin")) {
            System.out.println("Admin user detected!");
        }
        // Additional processing logic...
    }

    public void addUser(User user) {
        // Adding user...
        users.add(user);
    }
}
