package models;

public class Lectures {
    private HomeWork homeWork;
    private AddMaterials addMaterials;
    private long ID;
    private String name;
    private String description;


    public static long counter;
    public int courseID;

    public String personID;

    public Lectures(String personID) {
        this.personID = personID;
    }

    @Override
    public String toString() {
        return "Lectures{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", courseID=" + courseID +
                '}';
    }

    public Lectures(String name, String description, int courseID) {
        this.description = description;
        this.courseID = courseID;
        this.name = name;
        ID = counter++;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
}





