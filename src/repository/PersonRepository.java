package repository;

import models.SuperClass;

public class PersonRepository extends SuperRepository{
    @Override
    public SuperClass[] getALL() {
        return super.getALL();
    }

    @Override
    public void add(SuperClass increase) {
        super.add(increase);
    }

    @Override
    public void getByID(int ID) {
        super.getByID(ID);
    }

    @Override
    public void deleteByID(int ID) {
        super.deleteByID(ID);
    }
}
