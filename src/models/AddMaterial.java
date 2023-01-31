package models;

public class AddMaterial extends SuperClass {
    private static int counterAddMaterials;

    public AddMaterial(int id) {
        super(id);
        counterAddMaterials++;

    }
}
