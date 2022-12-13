package models;

public class Lectures {
    private HomeWork homeWork;
    private AddMaterials addMaterials;
    private long ID;
    private String name;

    public static long counter;
    public int courseID;

    public Lectures(String name, int courseID) {
        this.courseID = courseID;
        this.name = name;
        ID = counter++;
    }
}




