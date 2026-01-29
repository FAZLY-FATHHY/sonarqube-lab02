package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserService {

    // Read password from environment variable for security
    private final String dbUser = "root";
    private final String dbPassword = System.getenv("DB_PASSWORD"); // set DB_PASSWORD in your system
    private final String dbUrl = "jdbc:mysql://localhost/db";

    /**
     * Finds a user safely using PreparedStatement to avoid SQL injection
     */
    public void findUser(String username) {
        String query = "SELECT * FROM users WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username); // safely set parameter

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                // For demonstration, print user info
                System.out.println("Found user: " + rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
