package com.example.uims.dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb",
                    "root", "Babaiaga12");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection() {

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}