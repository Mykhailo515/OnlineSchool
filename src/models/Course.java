package models;

public class Course {

    private Teachers teachers;
    private Students students;
    private Lectures lectures;
    private static int ID;
    private static long counter;

    public Course() {
        ID++;
    }
    public int getID() {
        return ID;
    }
     }


