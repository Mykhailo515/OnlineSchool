package models;

import static models.Role.TEACHER;

public class Person extends SuperClass {
    private static int courseID;
    private static int counter = 0;
    private final Role role = TEACHER;


    public Person(int ID, int courseID, Role role) {
        super(ID);
        this.courseID = courseID;
    //    this.role = role;
        counter++;

    }

    public Person(int id) {
        super(id);
    }


    @Override
    public String toString() {
        return "Person{" +
                "courseID=" + courseID +
                ", role=" + role +
                '}';
    }
}
