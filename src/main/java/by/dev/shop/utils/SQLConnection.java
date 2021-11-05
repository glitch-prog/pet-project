package by.dev.shop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/butchers_shop";
    private static final String USER = "root";
    private static final String PASSWORD = "Pasha123098)";

    public static Connection GetConnection () throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
