package com.company;

import com.company.entity.Championship;
import com.company.entity.Countries;
import com.company.entity.Teams;
import com.company.entity.TypeOfSport;
import com.company.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

public class Main {
    static Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
    public static void main(String[] args) {

        Countries country = new Countries(1L, "Germany");
        TypeOfSport typeOfSport = new TypeOfSport(1L, "Volleyball");
        Championship championship = new Championship(1L, country, "FIVB", typeOfSport );
        Teams teams = new Teams(1L, "Berlin TCV", "https://i.pinimg.com/.png", "https://volley.ru/", typeOfSport);
        saveEntity(country);
        saveEntity(typeOfSport);
        saveEntity(championship);
        saveEntity(teams);
        HibernateUtil.shutdown();
    }

    public static <T> T saveEntity(T entity) {

        hibernateSession.beginTransaction();
        hibernateSession.save(entity);
        hibernateSession.getTransaction().commit();

        return entity;
    }
}
