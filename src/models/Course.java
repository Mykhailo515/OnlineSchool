package models;

public class Course {
    private int ID;
    private static long counter;
    private String name;

    private Teachers teachers;
    private Students students;
    private Lectures lectures;

    public Course(int ID) {
        this.ID = ID;
    }


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


