package com.company.Model;

import java.sql.*;


public class People {
    private int id_person;
    private String full_name;
    private Date date_birth;


    public People(int id_person, String full_name) {
        this.id_person = id_person;
        this.full_name = full_name;
    }

    public People() {
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }
}
