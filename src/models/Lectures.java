package models;

public class Lectures {
    private HomeWork homeWork;
    private AddMaterials addMaterials;
    private long ID;
    private String name;

    public static long counter;
    public int courseID;

    public String personID;

    public Lectures(String personID) {
        this.personID = personID;
    }

    public Lectures(String name, int courseID) {
        this.courseID = courseID;
        this.name = name;
        ID = counter++;
    }
    Role role = Role.TEACHER;
}




