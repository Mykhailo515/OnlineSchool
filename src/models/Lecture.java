package models;

public class Lecture extends SuperClass {
    private HomeWork homeWork;
    private AddMaterial addMaterials;
    private int counterLecture;
    private String name;
    private int courseID;

    private int personID;

    public Lecture(int ID, int courseID, int personID) {
        super(ID);
        this.courseID = courseID;
        this.personID = personID;
        ID = counterLecture++;
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




