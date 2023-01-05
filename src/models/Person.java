package models;

public class Person {

    private final int courseID;
    private final int role;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;

    Role student = Role.STUDENT;
    Role teacher = Role.TEACHER;

    public Person(int courseID, int role, String firstname, String lastname, String phone, String email) {
        this.courseID = courseID;
        this.role = role;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "courseID=" + courseID +
                ", role=" + role +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
