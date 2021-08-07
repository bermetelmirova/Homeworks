package com.company.Dao.Impl;

import com.company.Dao.UserLogDao;
import com.company.Model.UserLog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.company.Dao.BaseDao.connect;


public class UserLogDaoImpl implements UserLogDao {
    public ArrayList<UserLog> getAll() throws SQLException {
        ArrayList<UserLog> userLogArrayList = null;
        try (
                Connection connection = connect();
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM user_logs");
                ResultSet resultSet = statement.executeQuery()) {
            userLogArrayList = new ArrayList<>();

            while (resultSet.next()) {
                UserLog userLog = new UserLog();
                userLog.setId(resultSet.getInt("id"));
                userLog.setSuccess(resultSet.getBoolean("is_success"));
                userLog.setUser(resultSet.getInt("user_id"));
                userLogArrayList.add(userLog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userLogArrayList;
    }
}
