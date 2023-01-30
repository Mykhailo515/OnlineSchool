package models;

public class Teacher extends SuperClass {
    private static int counterTeacher;

    public Teacher(int ID, int counter) {

        super(ID);
        counterTeacher++;
    }
}
