package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соединения с БД
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/baledbtest";
    private static final String DB_USERNAME = "rootroot";
    private static final String DB_PASSWORD = "rootroot";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_PASSWORD, DB_USERNAME);
            if (!connection.isClosed()) {
                System.out.println("Connected!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
