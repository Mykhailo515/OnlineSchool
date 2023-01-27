package models;

public class SuperClass {
    private int ID;

    public SuperClass(int ID) {
        this.ID = ID;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "ID=" + ID +
                '}';
    }
}
