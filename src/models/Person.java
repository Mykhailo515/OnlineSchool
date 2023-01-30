package models;

import static models.Role.TEACHER;

public class Person extends SuperClass {
    private int courseID;
    private static int counter = 0;
    private Role role;
    private String lastname = "Jordan";
    private String firstname = "Michael";
    private String phone = "+12689990175";
    private String email = "jordan.air@com.usa";


    public Person(int ID, int courseID, Role role) {
        super(ID);
        this.courseID = courseID;
        this.role = role;
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
