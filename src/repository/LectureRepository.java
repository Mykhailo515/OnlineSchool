package repository;

import models.Lecture;
import models.SuperClass;

public class LectureRepository extends SuperRepository {

    private static int STANDARD_VALUE_ARRAY = 5;
    private static Lecture[] lectureArray;
    private static int newCapacity;
    public static Lecture[] increaseArray;
    private static int fullOF = 0;


    public LectureRepository() {

        this.lectureArray = new Lecture[STANDARD_VALUE_ARRAY];
    }


    @Override
    public String toString() {
        return "LecturesRepository{}";
    }


    public static void addLecture(Lecture o) {
        if (lectureArray[lectureArray.length - 1] != null) {
            increaseCapacity();
        }
        for (int i = 0; i < lectureArray.length; i++) {
            if (lectureArray[i] == null) {
                lectureArray[i] = o;
                break;
            }
        }
    }

    private static void increaseCapacity() {
        newCapacity = (STANDARD_VALUE_ARRAY * 3) / 2 + 1;
        increaseArray = new Lecture[newCapacity];

        System.arraycopy(lectureArray, 0, increaseArray, 0, STANDARD_VALUE_ARRAY);
        lectureArray = increaseArray;

    }

    public static void newArray(Lecture o) {
        for (int i = 0; i < increaseArray.length; i++) {
            if (increaseArray[i] == null) {
                increaseArray[i] = o;
                break;
            }
        }
    }

    public static Lecture[] getLectureArray() {
        return lectureArray;
    }

    public static Lecture[] getIncreaseArray() {
        return increaseArray;
    }

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