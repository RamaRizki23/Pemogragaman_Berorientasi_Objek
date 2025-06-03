package Pertemuan14.Tugas4;

// DatabaseConnection.java
public class DatabaseConnection {
    public static String connectionString;

    static {
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Database connection initialized.");
    }
}
