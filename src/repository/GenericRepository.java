package repository;

import models.SuperClass;

public class GenericRepository <E extends SuperClass>{
    private static int VALUE_ARRAY = 5;
    private static int newSize;

    // метод возвращает размер массива
    public int size() {
        return newSize;
    }

    // метод проверяет на пустоту весь массив
    public boolean isEmpty() {
        boolean emptySize = false;
        if (newSize == 0) {
            emptySize = true;
        }
        return emptySize;
    }
    // метод получает индекс массива - в задании в параметре говорится int index 60??
    public E getIndex(int index){
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (i==index){
                break;
            }
            return (E) arraySuperclass[i];
        }
        return null;
    }

    // метод добавляет элемент в массив.
    public void add(E fillIN) {
        for (int i = 0; i<arraySuperclass.length; i++) {
            if (arraySuperclass[i] != null) {
                continue;
            }
            arraySuperclass[i] = (E) fillIN;
            break;
        }
    }
    // метод добавляет элементы по индексу
    public void addIndex(int index,E fillIN) {
        for (int i = 0; i<arraySuperclass.length; i++) {
            if (arraySuperclass[index] == null) {
                arraySuperclass[index] = (E) fillIN;
                break;
            }
        }

    }
    // метод удаляет элемент по индексу, но не сдвиагает элементы
    public void remove(int index){
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (arraySuperclass[i] != null) {
                if (index == arraySuperclass[i].getID()) {
                    arraySuperclass[i] = null;
                }
            }
        }
    }
}
