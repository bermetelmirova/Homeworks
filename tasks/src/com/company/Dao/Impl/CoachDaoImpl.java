package com.company.Dao.Impl;

import com.company.Model.Coach;
import com.company.Dao.CoachDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.company.Dao.DatabaseDao.connect;

public class CoachDaoImpl implements CoachDao {
    @Override
    public List<Coach> getAll() throws SQLException {
        List<Coach> coaches = null;
        try (
                Connection connection = connect();
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM students");
                ResultSet resultSet = statement.executeQuery()) {
            coaches = new ArrayList<>();

            while (resultSet.next()) {
                Coach coach = new Coach();
                coach.setId_coach(resultSet.getInt("id"));
                coach.setFull_name(resultSet.getString("full_name"));
                coach.setType_sport(resultSet.getInt("type_sport"));
                coach.setPhone_number(resultSet.getInt("phone_number"));
                coach.setInn(resultSet.getString("inn"));
                coaches.add(coach);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return coaches;
    }

    @Override
    public void ShowPayment() {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select c.full_name, s.payment from coach c join sport s on c.type_sport = s.id_sport ")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("full_name"));
                System.out.println(resultSet.getInt("payment"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void totalSum() {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select sum(s.payment) as total_sum from coach c  join sport s on c.type_sport = s.id_sport")) {
            while (resultSet.next()) {
                System.out.println("Total sum: " + resultSet.getString("total_sum"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void threeLetters() {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select c.full_name from coach c ")) {
            while (resultSet.next()) {
                if(resultSet.getString("full_name").length()> 3){
                    System.out.println(resultSet.getString("full_name") + " молодец");
                }
                else {
                    System.out.println(resultSet.getString("full_name"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
