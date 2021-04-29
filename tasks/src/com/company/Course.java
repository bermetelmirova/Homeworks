package com.company;

public class Course {
    private String name;
    private String dateOfCreation;
    private int ID;
    private String mentorName;

    public Course() {}

    public Course(String name, String dateOfCreation, int ID, String mentorName) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.ID = ID;
        this.mentorName = mentorName;
    }

    public String getName() {
        return name;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public int getID() {
        return ID;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }


}
