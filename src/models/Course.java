package models;

public class Course extends SuperClass {
    private static int counterCourse;

    public Course(int id) {
        super(id);
        counterCourse++;
    }
}


