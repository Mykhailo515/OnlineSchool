package repository;

import models.Lecture;
import models.SuperClass;

public class GenericRepository<E extends SuperClass> {


    private static int newSize;
    private SuperClass[] arraySuperclass;
//    public void addSuperclass(Lecture o) {
//        if (arraySuperclass[arraySuperclass.length - 1] != null) {
//            increaseCapacity();
//        }
//        for (int i = 0; i < arraySuperclass.length; i++) {
//            if (arraySuperclass[i] == null) {
//                arraySuperclass[i] = o;
//                break;
//            }
//        }
//    }

//    public static void increaseCapacity() {
//        newSize = (STANDARD_VALUE_ARRAY * 3) / 2 + 1;
//        increaseArray = new Lecture[newCapacity];
//
//        System.arraycopy(lectureArray, 0, increaseArray, 0, lectureArray.length);
//
//        lectureArray = increaseArray;
//
//    }


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
