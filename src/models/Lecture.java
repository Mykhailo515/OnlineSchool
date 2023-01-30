package models;

public class Lecture extends SuperClass {
    private HomeWork homeWork;
    private AddMaterial addMaterials;
    private long counterLecture;
    private int courseID;
    private int personID;
    private String name;
    private String description;

    public Lecture(int ID, int courseID, int personID, String name, String description) {
        super(ID);
        this.courseID = courseID;
        this.personID = personID;
        this.name = name;
        this.description = description;
        counterLecture++;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                ", counterLecture=" + counterLecture +
                ", courseID=" + courseID +
                ", personID=" + personID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}





