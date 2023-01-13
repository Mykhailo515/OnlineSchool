package models;

public class Lectures {
    private HomeWork homeWork;
    private AddMaterials addMaterials;
    private long ID;
    private String name;

    public static long counter;
    public static int courseID;

    @Override
    public String toString() {
        return "Lectures{" +
                "name='" + name + '\'' +
                ", courseID=" + courseID +
                '}';
    }

    public Lectures(long ID, String name, int courseID) {
        this.ID = ID;
        this.name = name;
        this.courseID = courseID;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public static int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
}





