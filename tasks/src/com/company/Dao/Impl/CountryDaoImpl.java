package com.company.Dao.Impl;

import com.company.Model.Country;
import com.company.Dao.CountryDao;

import java.sql.*;

import static com.company.Dao.DatabaseDao.connect;

public class CountryDaoImpl implements CountryDao {
    @Override
    public void saveCountry(Country country) {
        try (
                Connection connection = connect();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into country(id_country, name_country,population, prezident)" +
                        "values(?, ?, ?, ?)")) {
            preparedStatement.setInt(1, country.getId_country());
            preparedStatement.setString(2, country.getName_country());
            preparedStatement.setInt(3, country.getPopulation());
            preparedStatement.setString(4, country.getPrezident());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void letterK(Country country) {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select c2.name_city from country c join city c2 on c2.country = c.id_country where c2.name_city like 'K%' and c.id_country = " + country.getId_country())) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name_city"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void getPopulationOfCountry(Country Country) {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select sum(c.population) as total_population from country c2 join city c on c.country = c2.id_country")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("total_population"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addStateLanguage(Country country) {
        try (
                Connection connection = connect();
                PreparedStatement preparedStatement = connection.prepareStatement("update country " +
                        " set state_language = ? " +
                        " where id_country = ?")) {
            preparedStatement.setString(1, "'" + country.getState_language() + "'");
            preparedStatement.setInt(2, country.getId_country());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    public void showCountry() {
        try (
                Connection connection = connect();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from country")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id_country"));
                System.out.println(resultSet.getString("name_country"));
                System.out.println(resultSet.getInt("population"));
                System.out.println(resultSet.getString("prezident"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
