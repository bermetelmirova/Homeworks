package com.company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        taskA();
    }
    static void taskA(){
        ArrayList<Car> cars = new ArrayList<>();
        CarDaoImpl carDao = new CarDaoImpl();
        cars.addAll(carDao.getALlCar());
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            hashMap.put(cars.get(i).getIdCar(), cars.get(i).toString());
        }
        System.out.println(hashMap);

       /* SQL
        create table cars(
                id_car integer primary key,
                year_of_produce integer not null,
                model varchar(20) not null,
                color varchar(20) not null);

        insert into cars (id_car, year_of_produce, model, color) values (1, 2012, 'Cruze', 'Violet');
        insert into cars (id_car, year_of_produce, model, color) values (2, 1992, '300SE', 'Maroon');
        insert into cars (id_car, year_of_produce, model, color) values (3, 1991, 'Tempo', 'Puce');
        insert into cars (id_car, year_of_produce, model, color) values (4, 1992, 'Tercel', 'Fuscia');
        insert into cars (id_car, year_of_produce, model, color) values (5, 2000, 'Eldorado', 'Khaki');
        insert into cars (id_car, year_of_produce, model, color) values (6, 2007, 'Eclipse', 'Mauv');
        insert into cars (id_car, year_of_produce, model, color) values (7, 2009, 'Malibu', 'Pink');
        insert into cars (id_car, year_of_produce, model, color) values (8, 1986, '1000', 'Turquoise');
        insert into cars (id_car, year_of_produce, model, color) values (9, 1996, 'Beretta', 'Mauv');
        */
    }
    static void  taskB(){
              /*1. Что такое ключ в HashMap?
              что-то вроде айдишки но кличка(ключ может быть любого типа) и он уникален
                2. Что такое значение в HashMap?
                Сам объект
                3. Основная логика HashMap?
                Хранение данных парами ключ-значение
                4. Уникальны ли ключи в HashMap? Почему?
                да, чтобы обратится к нему по ключу и получить данные
                5. Уникальны ли значения в HashMap? Почему?
                нет, значение это данные и они могут быть одинаковыми
                6. Как пройтись по всем значениям?
                циклом через Map.Entry
                7. Как получить значение по ключу?
                hashmap.get(key)*/
    }
}
