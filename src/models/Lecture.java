package models;

public class Lecture extends SuperClass {
    private HomeWork homeWork;
    private AddMaterial addMaterials;
    private long counterLecture;
    private int courseID;
    private int personID;
    private String name;
    private String description;

    public Lecture(int ID, int courseID, int personID) {
        super(ID);
        this.courseID = courseID;
        this.personID = personID;
        counterLecture++;
    }

    @Override
    public String toString() {
        return "Lectures{" +
                ", courseID=" + courseID +
                ", personID=" + personID +
                '}';
    }
}





