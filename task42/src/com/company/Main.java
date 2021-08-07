package com.company;

import com.company.Dao.Impl.UserDaoImpl;
import com.company.Dao.Impl.UserLogDaoImpl;
import com.company.Model.User;
import com.company.Model.UserLog;

import java.sql.*;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws  SQLException {
        UserDaoImpl usersDao =  new UserDaoImpl();
        User userModel = new User(1, "bermet", "bermet@email", "123456");
        usersDao.authorize("bermet", "123456");
        UserLogDaoImpl userDao = new UserLogDaoImpl();
        ArrayList<UserLog> users = new ArrayList<>();
        users.addAll(userDao.getAll());
        System.out.println(users);
    }
}
