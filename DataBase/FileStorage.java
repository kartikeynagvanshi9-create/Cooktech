package db;

import models.*;
import java.io.*;
import java.util.*;

public class FileStorage {

    // ---------- USERS ----------
    public static List<User> loadUsers() {
        List<User> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/users.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                list.add(new User(
                        Integer.parseInt(a[0]),
                        a[1], a[2], a[3]
                ));
            }
        } catch (Exception e) {
            System.out.println("No user file found (loading default users).");
        }
        return list;
    }

    public static void saveUsers(List<User> users) {
        try {
            PrintWriter pw = new PrintWriter("data/users.txt");
            for (User u : users)
                pw.println(u);
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing users.");
        }
    }

    // ---------- CLASSES ----------
    public static List<CookingClass> loadClasses() {
        List<CookingClass> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/classes.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                list.add(new CookingClass(
                        Integer.parseInt(a[0]),
                        a[1], a[2], a[3],
                        Integer.parseInt(a[4])
                ));
            }
        } catch (Exception e) {
            System.out.println("No class file.");
        }
        return list;
    }

    public static void saveClasses(List<CookingClass> classes) {
        try {
            PrintWriter pw = new PrintWriter("data/classes.txt");
            for (CookingClass c : classes)
                pw.println(c);
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing classes.");
        }
    }

    // ---------- CONTENT ----------
    public static List<Content> loadContent() {
        List<Content> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/content.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] a = line.split(",");
                Content c = new Content(
                        Integer.parseInt(a[0]),
                        a[1], a[2]
                );
                c.status = a[3];
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println("No content file.");
        }
        return list;
    }

    public static void saveContent(List<Content> content) {
        try {
            PrintWriter pw = new PrintWriter("data/content.txt");
            for (Content c : content)
                pw.println(c);
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing content.");
        }
    }
}
