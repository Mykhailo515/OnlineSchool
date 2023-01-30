package models;

public class HomeWork extends SuperClass{
    private static int counterHW;
    public HomeWork(int ID, int counter) {

        super(ID);
        counterHW++;
    }
}
