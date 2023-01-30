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


    public Person(int ID, int courseID, Role role, String lastname, String firstname, String phone, String email) {
        super(ID);
        this.courseID = courseID;
        this.role = role;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.email = email;
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
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
