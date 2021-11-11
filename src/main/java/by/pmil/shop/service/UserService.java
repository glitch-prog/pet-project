package by.pmil.shop.service;

import by.pmil.shop.dao.UserDAO;
import by.pmil.shop.entity.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Connection;


@AllArgsConstructor @NoArgsConstructor
public class UserService {
    private UserDAO userDAO;


    public void saveOrders (User user, Connection connection) {
        userDAO.saveOrder(user, connection);
    }
}
