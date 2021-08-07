package com.company.Dao.Impl;

import com.company.Dao.UserDao;
import com.company.Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.company.Dao.BaseDao.connect;


public class UserDaoImpl implements UserDao {
    @Override
    public void createUser(User userModel) {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into users(login, email, password, date_of_registration)" +
                     "values(?, ?, ?, now())")) {
            preparedStatement.setString(1, userModel.getLogin());
            preparedStatement.setString(2, userModel.getEmail());
            preparedStatement.setString(3, userModel.getPassword());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void createLog(User userModel, boolean success) {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into user_logs(is_success, user_id)" +
                     "values(?, ?)")) {
            preparedStatement.setBoolean(1, success);
            preparedStatement.setInt(2, userModel.getId());

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void authorize(String userName, String password) {
        try (
             Connection connection = connect();
             ResultSet resultSet1 = connection.createStatement().executeQuery("SELECT * FROM users where login = '" + userName + "'");
        ) {
            if (resultSet1.next()) {
                User userModel = new User();
                userModel.setId(resultSet1.getInt("id"));
                userModel.setLogin(resultSet1.getString("login"));
                userModel.setEmail(resultSet1.getString("email"));
                userModel.setPassword(resultSet1.getString("password"));
                userModel.setDateOfRegistration(resultSet1.getDate("date_of_registration"));
                if (password.equals(userModel.getPassword())) {
                    System.out.println("Вы успешно зашли");
                    createLog(userModel, true);
                } else {
                    System.out.println("Неправильный пароль!");
                    createLog(userModel, false);
                }
            } else {
                System.out.println("Heт такого логина!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

