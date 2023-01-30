package models;

public class SuperClass {
    private int id;

    public SuperClass(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SuperClass{" +
                "id=" + id +
                '}';
    }
}
