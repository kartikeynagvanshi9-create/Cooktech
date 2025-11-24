package services;

import db.Database;
import models.*;
import java.util.*;

public class UserService {
    Scanner sc = new Scanner(System.in);

    public void dashboard(int userId) {
        while (true) {
            System.out.println("\n--- USER DASHBOARD ---");
            System.out.println("1. View Classes");
            System.out.println("2. Watch Sessions");
            System.out.println("3. Logout");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1: viewClasses(); break;
                case 2: System.out.println("Session Playing..."); break;
                case 3:
                    Database.saveAll();
                    return;
            }
        }
    }

    void viewClasses() {
        for (CookingClass c : Database.classes) System.out.println(c);
    }
}
