package by.pmil.shop.dao;

import by.pmil.shop.entity.User;

import java.sql.Connection;

public interface UserDAO {

    boolean saveOrder(User user, Connection connection);



}
