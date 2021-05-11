package ItAcademyStructure;

public class Student {
    private String dateOfBirth;
    private String lastName;
    private String firstName;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return "Я " + lastName  + " " + firstName  + ", " + age + "\n";
    }

    public Student() {
    }

    public Student(String dateOfBirth, String lastName, String firstName, String gender, int age) {
        this.dateOfBirth = dateOfBirth;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age <= 0)
            System.err.println("Wrong age!!");
        else
            this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
