package by.pmil.shop.dao;

import by.pmil.shop.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO{

    private static final String SAVE = "INSERT INTO users (username, number) VALUES (?, ?)";

    private static final int USERNAME = 1;
    private static final int NUMBER = 2;

    @Override
    public boolean saveOrder(User user, Connection connection) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE);
            preparedStatement.setString(USERNAME, user.getUsername());
            preparedStatement.setString(NUMBER, user.getNumbers());
            preparedStatement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
