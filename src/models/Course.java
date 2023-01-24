package models;

public class Course extends SuperClass{
    private Teachers teachers;
    private Students students;
    private Lectures lectures;


    public Course(int ID, int counter) {
        super(ID, counter);
    }
}


