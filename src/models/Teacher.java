package models;

public class Teacher extends SuperClass {
    public static int counterTeacher;

    public Teacher(int ID, int counter) {

        super(ID);
        counterTeacher++;
    }
}
