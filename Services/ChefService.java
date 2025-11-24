package services;

import db.Database;
import models.*;
import java.util.*;

public class ChefService {
    Scanner sc = new Scanner(System.in);

    public void dashboard(int chefId) {
        while (true) {
            System.out.println("\n--- CHEF DASHBOARD ---");
            System.out.println("1. Create Class");
            System.out.println("2. Upload Content");
            System.out.println("3. Logout");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1: createClass(chefId); break;
                case 2: uploadContent(); break;
                case 3:
                    Database.saveAll();
                    return;
            }
        }
    }

    void createClass(int chefId) {
        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Description: ");
        String desc = sc.nextLine();

        System.out.print("Schedule: ");
        String schedule = sc.nextLine();

        int id = Database.classes.size() + 1;
        Database.classes.add(new CookingClass(id, title, desc, schedule, chefId));

        System.out.println("Class created!");
    }

    void uploadContent() {
        System.out.print("Video Title: ");
        String title = sc.nextLine();

        System.out.print("Recipe: ");
        String recipe = sc.nextLine();

        int id = Database.contents.size() + 1;
        Database.contents.add(new Content(id, title, recipe));

        System.out.println("Content Uploaded!");
    }
}
