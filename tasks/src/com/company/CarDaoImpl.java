package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import static com.company.DBConnection.connect;

public class CarDaoImpl implements CarDao {
    @Override
    public ArrayList<Car> getALlCar() {
        ArrayList<Car> cars = null;
        try (
                Connection connection = connect();
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM cars");
                ResultSet resultSet = statement.executeQuery()) {
            cars = new ArrayList<>();

            while (resultSet.next()) {
                Car car = new Car();
                car.setIdCar(resultSet.getInt("id_car"));
                car.setYear(resultSet.getInt("year_of_produce"));
                car.setModel(resultSet.getString("model"));
                car.setColor(resultSet.getString("color"));
                cars.add(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cars;
    }
}

