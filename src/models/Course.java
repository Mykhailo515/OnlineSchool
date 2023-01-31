package models;

public class Course extends SuperClass {
    private static int counterCourse;
    private String name;

    public Course(int id, String name) {
        super(id);
        this.name = name;
        counterCourse++;
    }
}


