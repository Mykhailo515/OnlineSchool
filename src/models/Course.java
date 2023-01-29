package models;

public class Course extends SuperClass {
    private Teacher teachers;
    private Student students;
    private Lecture lectures;
    public static int counterCourse;


    public Course(int ID) {
        super(ID);
        counterCourse++;
    }
}


