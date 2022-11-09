package models;

public class Lectures {
    private HomeWork homeWork;
    private AddMaterials addMaterials;
    private static long ID;
    public static long counter;
    public int courseID;

    public Lectures(int courseID) {
        ID = counter++;
        this.courseID = courseID;
    }




}




