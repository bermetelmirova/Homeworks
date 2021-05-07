package com.company;

import java.util.Arrays;

public class Lesson {
    private String date;
    private Student [] amountOfStudents;
    Course course;
    private String beginTime;
    private boolean isHomework;
    private boolean isExam;

    @Override
    public String toString() {
        return "Урок  : " +
                "Дата:" + date  +
                ", присуствующие студенты: \n" + Arrays.toString(amountOfStudents) +
                "\n  " + course +
                ", начинается в " + beginTime  +
                ", есть ли дз: " + isHomework +
                ", был ли экзамен: " + isExam +
                '}';
    }

    public Lesson() {
    }

    public Lesson(String date, Student[] amountOfStudents, Course course, String beginTime, boolean isHomework, boolean isExam) {
        this.date = date;
        this.amountOfStudents = amountOfStudents;
        this.course = course;
        this.beginTime = beginTime;
        this.isHomework = isHomework;
        this.isExam = isExam;
    }

    public String getDate() {
        return date;
    }

    public Student[] getAmountOfStudents() {
        return amountOfStudents;
    }

    public Course getCourse() {
        return course;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public boolean isHomework() {
        return isHomework;
    }

    public boolean isExam() {
        return isExam;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmountOfStudents(Student[] amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setHomework(boolean homework) {
        isHomework = homework;
    }

    public void setExam(boolean exam) {
        isExam = exam;
    }
}
