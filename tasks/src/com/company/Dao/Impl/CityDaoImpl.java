package com.company.Dao.Impl;

import com.company.Model.City;
import com.company.Dao.CityDao;

import java.sql.*;

import static com.company.Dao.DatabaseDao.connect;

public class CityDaoImpl implements CityDao {
    @Override
    public void saveCity(City city) {
        try (
                Connection connection = connect();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into city(id_city, name_city, country, mayor, population)" +
                        "values(?, ?, ?, ?, ?)")) {
            preparedStatement.setInt(1, city.getId_city());
            preparedStatement.setString(2, city.getName_city());
            preparedStatement.setInt(3, city.getCountry());
            preparedStatement.setString(4, city.getMayor());
            preparedStatement.setInt(5, city.getPopulation());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void showCity() {
        try (
                Connection connection = connect();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select c.id_city, c.name_city, l.full_name, c2.name_country, c.population from city c join  country c2 on c.country = c2.id_country ")
        ) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id_city"));
                System.out.println(resultSet.getString("name_city"));
                System.out.println(resultSet.getString("mayor"));
                System.out.println(resultSet.getString("name_country"));
                System.out.println(resultSet.getInt("population"));
                System.out.println();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
