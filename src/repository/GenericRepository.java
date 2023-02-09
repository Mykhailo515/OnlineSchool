package repository;

import models.Lecture;
import models.SuperClass;

public class GenericRepository<E extends SuperClass> {

    private static int VALUE_ARRAY = 5;
    private static SuperClass[] arraySuperclass;

    private static int newSize;

    private static SuperClass[] increaseArray;

    public GenericRepository() {
        this.arraySuperclass = new SuperClass[VALUE_ARRAY];
        this.increaseArray = new SuperClass[newSize];
    }

    public static void addLecture(SuperClass o) {
        if (arraySuperclass[arraySuperclass.length - 1] != null) {
            increaseCapacity();
        }
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

    public static void newArray(Lecture o) {
        for (int i = 0; i < increaseArray.length; i++) {
            if (increaseArray[i] == null) {
                increaseArray[i] = o;
                break;
            }
        }
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
            if (arraySuperclass[i] != null) {
                continue;
            }
            arraySuperclass[i] = (E) addIn;
            break;
        }
    }

        public void addIndex ( int index, E addIn){
            for (int i = 0; i < arraySuperclass.length; i++) {
                if (arraySuperclass[index] == null) {
                    arraySuperclass[index] = (E) addIn;
                    break;
                }
            }

        }

        public void remove ( int index){
            for (int i = 0; i < arraySuperclass.length; i++) {
                if (arraySuperclass[i] != null) {
                    if (index == arraySuperclass[i].getId()) {
                        arraySuperclass[i] = null;
                    }
                }
            }
        }

    public static SuperClass[] getArraySuperclass() {
        return arraySuperclass;
    }

    public static SuperClass[] getIncreaseArray() {
        return increaseArray;
    }
}
