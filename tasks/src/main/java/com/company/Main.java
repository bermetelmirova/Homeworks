package com.company;

import com.company.entity.*;
import com.company.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1L, "Java"));
        courses.add(new Course(2L, "C#"));
        for (int i = 0; i < courses.size(); i++) {
            saveEntity(courses.get(i));
        }
        List<Mentor> mentors = new ArrayList<>();
        mentors.add(new Mentor(1L, "Aidin", courses.get(0)));
        mentors.add(new Mentor(2L, "Shamil", courses.get(0)));
        mentors.add(new Mentor(3L, "Alim", courses.get(1)));
        mentors.add(new Mentor(4L, "Askhat", courses.get(1)));
        for (int i = 0; i < mentors.size(); i++) {
            saveEntity(mentors.get(i));
        }
        List<Group> groups = new ArrayList<>();
        groups.add(new Group(1L, "JAVA-21", mentors.get(0)));
        groups.add(new Group(2L, "C#-20", mentors.get(1)));
        groups.add(new Group(3L, "C#-21", mentors.get(2)));
        groups.add(new Group(4L, "JAVA-20", mentors.get(3)));
        for (int i = 0; i < groups.size(); i++) {
            saveEntity(groups.get(i));
        }
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L, "Bermet"));
        students.add(new Student(1L, "Azat"));
        students.add(new Student(1L, "Mirlan"));
        students.add(new Student(1L, "Chyngyz"));
        students.add(new Student(1L, "Nurdin"));
        for (int i = 0; i < students.size(); i++) {
            saveEntity(students.get(i));
        }
        List<StudentGroup> studentGroup = new ArrayList<>();
        studentGroup.add(new StudentGroup(1L, students.get(0), groups.get(0)));
        studentGroup.add(new StudentGroup(2L, students.get(1), groups.get(1)));
        studentGroup.add(new StudentGroup(3L, students.get(1), groups.get(1)));
        studentGroup.add(new StudentGroup(4L, students.get(2), groups.get(2)));
        studentGroup.add(new StudentGroup(6L, students.get(3), groups.get(3)));
        studentGroup.add(new StudentGroup(7L, students.get(4), groups.get(3)));
        studentGroup.add(new StudentGroup(8L, students.get(0), groups.get(0)));
        for (int i = 0; i < studentGroup.size(); i++) {
            saveEntity(studentGroup.get(i));
        }
        HibernateUtil.shutdown();
    }

    public static <T> T saveEntity(T entity) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }
}
