package models;

public class Lecture extends SuperClass {
    private long counterLecture;
    private int courseId;
    private int personId;
    private String name;
    private String description;

    public Lecture(int id, int courseId, int personId, String name, String description) {
        super(id);
        this.courseId = courseId;
        this.personId = personId;
        this.name = name;
        this.description = description;
        counterLecture++;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                ", counterLecture=" + counterLecture +
                ", courseId=" + courseId +
                ", personId=" + personId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}





