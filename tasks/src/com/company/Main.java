package com.company;

import com.company.Dao.CoachDao;
import com.company.Dao.GroupDao;
import com.company.Dao.Impl.*;
import com.company.Model.City;
import com.company.Model.Country;
import com.company.Model.People;

import java.util.ArrayList;
import java.util.Random;

public class Main {
static Random random = new Random();
    public static void main(String[] args) {
        CoachDao coachDao = new CoachDaoImpl();
        coachDao.ShowPayment();
        coachDao.totalSum();
        coachDao.threeLetters();
        GroupDao groupDao = new GroupDaoImpl();
        groupDao.printAmount();
        groupDao.showGroups();
        CountryDaoImpl countryDao = new CountryDaoImpl();
        CityDaoImpl cityDao = new CityDaoImpl();
        PeopleDaoImpl peopleDao = new PeopleDaoImpl();
        ArrayList<City> cities = new ArrayList<>();
        ArrayList<People> people = new ArrayList<>();
        Country country = new Country(1, "Russia", 50000000, "V.Putin");
        countryDao.saveCountry(country);
        Country country2 = new Country(2, "Kyrgyzstan", 50000000, "S.Japarov");
        countryDao.saveCountry(country2);
        String name = "City #";
        String mayor = "Mayor #";
        for (int i = 0; i < 5; i++) {
            cities.add(new City(i+1, name + (i+1), mayor+ (i+1), random.nextInt(1) + 1, random.nextInt(1000000)));
            cityDao.saveCity(cities.get(i));
        }

        cities.add(new City(6, "KaraKol", mayor+ 6, 2, random.nextInt(1000000)));
        cityDao.saveCity(cities.get(5));
        name = "Person #";
        for (int i = 0; i < 5; i++) {
            people.add(new People(i+1, name + (i+1)));
            peopleDao.savePerson(people.get(i));
        }
        countryDao.getPopulationOfCountry(country2);
        countryDao.letterK(country2);
        country.setState_language("RU");
        countryDao.addStateLanguage(country);

    }
}
