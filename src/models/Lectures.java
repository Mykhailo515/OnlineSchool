package models;

public class Lectures extends SuperClass {
    private HomeWork homeWork;
    private AddMaterials addMaterials;
    private String name;
    private int courseID;

    private int personID;

    public Lectures(int ID,int courseID, int personID) {
        super(ID);
        this.courseID = courseID;
        this.personID = personID;
    }

    @Override
    public String toString() {
        return "Lectures{" +
                "name='" + name + '\'' +
                ", courseID=" + courseID +
                ", personID=" + personID +
                '}';
    }
}





