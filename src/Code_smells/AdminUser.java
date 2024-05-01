package Code_smells;

import java.util.ArrayList;

public class AdminUser extends User {
    public AdminUser(String username, String email) {
        super(username, email);
    }

    public static int countAdminUsers(ArrayList<User> users) {
        int adminCount = 0;
        for (User user : users) {
            if (user.getUsername().contains("admin")) {
                adminCount++;
            }
        }
        return adminCount;
    }
}
