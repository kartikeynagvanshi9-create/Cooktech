package db;

import models.*;
import java.util.*;

public class Database {

    public static List<User> users;
    public static List<CookingClass> classes;
    public static List<Content> contents;

    static {
        users = FileStorage.loadUsers();
        classes = FileStorage.loadClasses();
        contents = FileStorage.loadContent();

        if (users.isEmpty()) {
            users.add(new User(1, "Admin", "admin@gmail.com", "Admin"));
            users.add(new User(2, "Chef", "chef@gmail.com", "Chef"));
            users.add(new User(3, "User", "user@gmail.com", "User"));
        }
    }

    public static void saveAll() {
        FileStorage.saveUsers(users);
        FileStorage.saveClasses(classes);
        FileStorage.saveContent(contents);
    }
}
