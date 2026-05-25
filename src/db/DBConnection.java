package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/student_db";

    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static Connection connect() {

        try {
            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Connected to database");
            return connection;

        } catch (Exception e) {
            System.out.println("Connection error");
            e.printStackTrace();
        }

        return null;
    }
}