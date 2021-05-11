package Output;

import ItAcademyProgramm.Course;
import ItAcademyProgramm.Lesson;
import ItAcademyStructure.Group;
import ItAcademyStructure.Student;

public class Main {

    public static void main(String[] args) {
        Course java = new Course("JV", "18/03/21", 21, "Nursultan Taalaibekov");
        Student[] students = new Student[2];
        students[0] = new Student("30.12.01", "Elmirova", "Bermet", "Female", 19);
        students[1] = new Student("22.12.00", "Ulan u", "Nurdin", "Male", 20);
        Group group = new Group(students, java, "18/03/21", 9);
        Lesson lesson = new Lesson("07/05/21", students, java, "19:00", true, false);
        System.out.println(java);
        for (Student temp : students) {
            System.out.println(temp);
        }
        System.out.println(group);
        System.out.println(lesson);
    }
}
