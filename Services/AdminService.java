package services;

import db.Database;
import models.*;
import java.util.*;

public class AdminService {
    Scanner sc = new Scanner(System.in);

    public void dashboard(int adminId) {
        while (true) {
            System.out.println("\n--- ADMIN DASHBOARD ---");
            System.out.println("1. Manage Users");
            System.out.println("2. Approve Content");
            System.out.println("3. View Classes");
            System.out.println("4. Save & Logout");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1: manageUsers(); break;
                case 2: manageContent(); break;
                case 3: viewClasses(); break;
                case 4:
                    Database.saveAll();
                    return;
            }
        }
    }

    void manageUsers() {
        System.out.println("\n1. Add User");
        System.out.println("2. View Users");
        int ch = sc.nextInt(); sc.nextLine();

        if (ch == 1) {
            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Email: "); String email = sc.nextLine();
            System.out.print("Role(Admin/Chef/User): "); String role = sc.nextLine();

            int id = Database.users.size() + 1;
            Database.users.add(new User(id, name, email, role));
            System.out.println("User created.");
        } else {
            for (User u : Database.users) System.out.println(u);
        }
    }

    void manageContent() {
        for (Content c : Database.contents) System.out.println(c);

        System.out.print("Enter Content ID: ");
        int id = sc.nextInt(); sc.nextLine();

        for (Content c : Database.contents) {
            if (c.contentId == id) {
                System.out.print("Approve/Reject: ");
                c.status = sc.nextLine();
                System.out.println("Updated!");
                return;
            }
        }
    }

    void viewClasses() {
        for (CookingClass c : Database.classes) System.out.println(c);
    }
}
