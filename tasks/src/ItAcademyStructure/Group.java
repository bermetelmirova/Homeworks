package ItAcademyStructure;


import ItAcademyProgramm.Course;

public class Group {
    private Student[] students;
    private Course course;
    private String dateOfStart;
    private int duration;

    @Override
    public String toString() {
        return "Это группа по курсу " + course.getName() + ", в которой обучается " + students.length + " чел.\n";
    }

    public Group() {
    }

    public Group(Student[] students, Course course, String dateOfStart, int duration) {
        this.students = students;
        this.course = course;
        this.dateOfStart = dateOfStart;
        this.duration = duration;
    }

    public Student[] getStudents() {
        return students;
    }

    public Course getCourse() {
        return course;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public int getDuration() {
        return duration;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
