package by.pmil.shop.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect2MySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/butchers_shop";
    private static final String USER = "root";
    private static final String PASSWORD = "Pasha123098)";

    public static Connection connection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
