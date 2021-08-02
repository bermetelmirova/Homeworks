package com.company.Model;

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

}
