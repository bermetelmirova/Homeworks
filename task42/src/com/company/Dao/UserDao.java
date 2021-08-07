package com.company.Dao;

import com.company.Model.User;

public interface UserDao {
    void createUser(User userModel);
    void createLog(User userModel, boolean success);
    void authorize(String userName, String password);
}
