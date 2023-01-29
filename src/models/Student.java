package models;

public class Student extends SuperClass {
    public static int counterStudent;

    public Student(int ID, int counter) {

        super(ID);
        counterStudent++;
    }
}
