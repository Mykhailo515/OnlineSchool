package models;

public class Person {
    private final int courseID;
    private final int role;

    public Person(int courseID, int role) {
        this.courseID = courseID;
        this.role = role;
    }
    Role student = Role.STUDENT;
    Role teacher = Role.TEACHER;
}
