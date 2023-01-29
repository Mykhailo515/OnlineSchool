package models;

public class AddMaterial extends SuperClass {
    public static int counterAddMaterials;

    public AddMaterial(int ID) {
        super(ID);
        counterAddMaterials++;

    }
}
