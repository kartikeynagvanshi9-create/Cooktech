import db.Database;
import models.User;
import services.*;
import java.util.*;

public class CookingPlatform {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== Online Cooking Class Platform ===");

        while (true) {
            System.out.print("Enter User ID to Login: ");
            int id = sc.nextInt();
            sc.nextLine();

            User u = getUser(id);
            if (u == null) {
                System.out.println("Invalid ID.");
                continue;
            }

            switch (u.role) {
                case "Admin": new AdminService().dashboard(u.id); break;
                case "Chef": new ChefService().dashboard(u.id); break;
                case "User": new UserService().dashboard(u.id); break;
                default: System.out.println("Unknown role.");
            }
        }
    }

    static User getUser(int id) {
        for (User u : Database.users)
            if (u.id == id)
                return u;
        return null;
    }
}
