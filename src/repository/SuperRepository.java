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
            if (arrayRepository[i] == null) {
                arrayRepository[i] = increase;
                break;
            }
        }
    }

    //метод перебирає кожен id
    public void getByID(int id) {
        for (SuperClass openLecture : arrayRepository) {
            if (openLecture != null) {
                if (id == openLecture.getId()) {
                    System.out.println(openLecture);
                }
            }
        }
    }

    //метод видаляє ID
    public void deleteByID(int id) {
        for (int i = 0; i < arrayRepository.length; i++) {
            if (arrayRepository[i] != null) {
                if (id == arrayRepository[i].getId()) {
                    arrayRepository[i] = null;
                }
            }
        }
    } ////add з параметром суперкласу сутностей – додавання нової лекції;  - не реалізовано до кінця
    //getById – відкрити вибрану лекцію; - нічого не повертає
    //deleteById – видалити вибрану лекцію - доробити з умовою розширення масиву
}
