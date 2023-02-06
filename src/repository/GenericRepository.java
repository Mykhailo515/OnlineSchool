package repository;

import models.Lecture;
import models.SuperClass;

public class GenericRepository<E extends SuperClass> {

    private static int VALUE_ARRAY = 5;

    private static int newSize;
    private static SuperClass[] arraySuperclass;

    private static SuperClass[] increaseArray;

    public static void addLecture(Lecture o) {

        for (int i = 0; i < arraySuperclass.length; i++) {
            if (arraySuperclass[i] == null) {
                arraySuperclass[i] = o;
                increaseCapacity();
                break;
            }
        }
    }

    private static void increaseCapacity() {
        newSize = (VALUE_ARRAY * 3) / 2 + 1;
        increaseArray = new Lecture[newSize];

        System.arraycopy(arraySuperclass, 0, increaseArray, 0, VALUE_ARRAY);
        arraySuperclass = increaseArray;

    }


    public int size() {
        return newSize;
    }

    public boolean isEmpty() {
        boolean emptySize = false;
        if (newSize == 0) {
            emptySize = true;
        }
        return emptySize;
    }

    public E getIndex(int index) {
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (i == index) {
                break;
            }
            return (E) arraySuperclass[i];
        }
        return null;
    }

    public void add(E addIn) {
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (arraySuperclass[i] == null) {
                arraySuperclass[i] = (E) addIn;
                break;
            }
        }
    }

    public void addIndex(int index, E addIn) {
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (arraySuperclass[index] == null) {
                arraySuperclass[index] = (E) addIn;
                break;
            }
        }

    }

    public void remove(int index) {
        for (int i = 0; i < arraySuperclass.length; i++) {
            if (arraySuperclass[i] != null) {
                if (index == arraySuperclass[i].getId()) {
                    arraySuperclass[i] = null;
                }
            }
        }
    }
}
