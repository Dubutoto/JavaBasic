package org.example.mongo2.module;

import java.sql.*;

public class MysqlHandler {
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/aws";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "Dubutoto22!";

    private Connection connection;

    public void connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
        System.out.println("Connected to MySQL.");
    }

    public int insertUser(String name, String email) throws SQLException {
        String insertUserSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertUserSQL, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
        return -1;
    }

    public ResultSet getUserById(int userId) throws SQLException {
        String selectUserSQL = "SELECT * FROM users WHERE id = ?";
        PreparedStatement pstmt = connection.prepareStatement(selectUserSQL);
        pstmt.setInt(1, userId);
        return pstmt.executeQuery();
    }

    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}

