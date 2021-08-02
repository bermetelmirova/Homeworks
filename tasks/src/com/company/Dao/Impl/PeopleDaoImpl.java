package com.company.Dao.Impl;

import com.company.Dao.PeopleDao;
import com.company.Model.People;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.company.Dao.DatabaseDao.connect;

public class PeopleDaoImpl implements PeopleDao {

    @Override
    public void savePerson(People person) {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into people(id_person, full_name, date_birth)" +
                     "values(?, ?, now())")) {
            preparedStatement.setInt(1, person.getId_person());
            preparedStatement.setString(2, person.getFull_name());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void showPeople() {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from people")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id_person"));
                System.out.println(resultSet.getString("full_name"));
                System.out.println(resultSet.getString("date_birth"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
