package com.company.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.company.Dao.DatabaseDao.connect;

public class Coach{
    private int id_coach;
    private String full_name;
    private int type_sport;
    private int phone_number;
    private String inn;

    public int getId_coach() {
        return id_coach;
    }

    public String getFull_name() {
        return full_name;
    }

    public int getType_sport() {
        return type_sport;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setId_coach(int id_coach) {
        this.id_coach = id_coach;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setType_sport(int type_sport) {
        this.type_sport = type_sport;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }
    public void show() {
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select c.full_name, s.payment from coach c join sport s on c.type_sport = s.id_sport ")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("full_name"));
                System.out.println(resultSet.getInt("payment"));
            }
        } catch (Exception e) {

        }
    }
}
