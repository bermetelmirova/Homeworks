package com.company.Dao;

import com.company.Model.UserLog;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserLogDao {
    ArrayList<UserLog> getAll() throws SQLException;
}
