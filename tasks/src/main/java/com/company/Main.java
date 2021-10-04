package com.company;

import com.company.entity.*;
import com.company.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class Main {
    static Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
    public static void main(String[] args) {

        Countries country = new Countries(1L, "Italy");
        TypeOfSport typeOfSport = new TypeOfSport(1L, "Volleyball");
        Championship championship = new Championship(1L, country, "FIVB", typeOfSport );
        Championship championship2 = new Championship(2L, country, "Italy Championship", typeOfSport );
        Teams teams = new Teams(1L, "Berlin TCV", "https://i.pinimg.com/.png", "https://volley.ru/", typeOfSport);
        Teams teams2 = new Teams(2L, "Italy TCV", "https://i.pinim.com/.png", "https://volle.ru/", typeOfSport);
        saveEntity(country);
        saveEntity(typeOfSport);
        saveEntity(championship);
        saveEntity(championship2);
        saveEntity(teams);
        saveEntity(teams2);
        ChampionshipTeam championshipTeam = new  ChampionshipTeam(1L, championship2, teams);
        saveEntity(championshipTeam);
        ChampionshipTeam championshipTeam2 = new  ChampionshipTeam(2L, championship2, teams2);
        saveEntity(championshipTeam2);
        System.out.println(getByName("FIVB"));
        System.out.println(getAllByChampionship());
        HibernateUtil.shutdown();
    }

    public static <T> T saveEntity(T entity) {

        hibernateSession.beginTransaction();
        hibernateSession.save(entity);
        hibernateSession.getTransaction().commit();

        return entity;
    }
    public static Championship getByName( String name){
        Championship championship = hibernateSession
                .createQuery("FROM Championship where name = :champName", Championship.class)
                .setParameter( "champName", name)
                .uniqueResult();
        return championship;
    }
    public static List<Teams> getAllByChampionship(){
        List<Teams> teams = hibernateSession
                .createQuery("select c.team from ChampionshipTeam c where " +
                        " c.championship.countryId.country = :name order by c.championship.sportId.name", Teams.class)
                .setParameter("name", "Italy")
                .list();
        return teams;
    }
    public static List<Teams> getTeams(){
        List<Teams> teams = hibernateSession
                .createQuery("SELECT t.team, t.webSiteURL FROM Teams t order by t.id", Teams.class)
                .setMaxResults(5)
                .list();
        return teams;
    }
}
