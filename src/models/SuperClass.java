package models;

public class SuperClass {
    private int ID;
    private int counter;

    public SuperClass(int ID, int counter) {
        this.ID = ID;
        this.counter = (int) counter;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
