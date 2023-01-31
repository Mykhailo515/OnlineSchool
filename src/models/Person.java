package models;

import static models.Role.TEACHER;

public class Person extends SuperClass {
    private int courseId;
    private static int counter = 0;
    private Role role;
    private String lastname = "Jordan";
    private String firstname = "Michael";
    private String phone = "+1268-999-01-75";
    private String email = "jordan.air@com.usa";


    public Person(int id, int courseID, Role role, String lastname, String firstname, String phone, String email) {
        super(id);
        this.courseId = courseId;
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
                "courseId=" + courseId +
                ", role=" + role +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
