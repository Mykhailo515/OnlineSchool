package models;

public class Course {

    private String name;
    private Teachers teachers;
    private Students students;
    private Lectures lectures;

    public Course(int ID) {
        this.ID = ID;
    }

    private int ID;
    private static long counter;

    public Course() {
        ID++;
    }

    public int getID() {
        return ID;
    }

    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}


