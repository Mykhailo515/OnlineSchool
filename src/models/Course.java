package models;

public class Course {

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

     }


