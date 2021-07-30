package com.company.Dao.Impl;

import com.company.Dao.GroupDao;

import java.sql.*;

import static com.company.Dao.DatabaseDao.connect;

public class GroupDaoImpl implements GroupDao {
    private static final String url = "jdbc:postgresql://localhost:5432/univercity";
    private static final String user = "postgres";
    private static final String password = "posgresql";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    @Override
    public void printAmount() {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select  count(s.*), g.group_code from student s join groupfaculty g on s.group_id = g.id_group group by group_code")) {
            while (resultSet.next()) {
                System.out.println("В группе " + resultSet.getString("group_code") + " " + resultSet.getInt("count") + " студента");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showGroups() {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select g.id_group , g.group_code from groupfaculty g")) {
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id_group") +"  ");
                System.out.println( resultSet.getString("group_code"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
