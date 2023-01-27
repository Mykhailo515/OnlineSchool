package models;

import static models.Role.TEACHER;

public class Person extends SuperClass {
    private final int courseID;
    private static int counter = 0;
    private final Role role = TEACHER;


    public Person(int ID, int courseID, Role role) {
        super(ID);
        this.courseID = courseID;
    //    this.role = role;
        counter++;

    }
    public static Person creatTeacher(int ID, int courseID, Role role){
        Person teacher = new Person(ID, courseID, TEACHER);
        return teacher;
    }

    @Override
    public String toString() {
        return "Person{" +
                "courseID=" + courseID +
                ", role=" + role +
                '}';
    }
}
