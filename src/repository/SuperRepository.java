package repository;

import models.SuperClass;

public class SuperRepository {

    private static SuperClass[] arrayRepository = new SuperClass[10];

    //повертає увесь масив
    public SuperClass[] getALL() {
        return arrayRepository;
    }

    //метод с параметром супер класу моделей для заповнення масиву в супер-репозиторій
    public void add(SuperClass increase) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] != null) {
                continue;
            }
            arrayRepository[i] = increase;
            break;
        }
    }

    //метод перебирає кожен ID
    public void getByID(int ID) {
        for (SuperClass openLecture : arrayRepository) {
            if (openLecture != null) {
                if (ID == openLecture.getID()) {
                    System.out.println(openLecture);
                }
            }
        }
    }

    //метод видаляє ID
    public void deleteByID(int ID) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] != null) {
                if (ID == arrayRepository[i].getID()) {
                    arrayRepository[i] = null;
                }
            }
        }
    }
}
