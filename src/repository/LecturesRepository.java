package repository;

import models.Course;
import models.Lectures;

public class LecturesRepository {

    private static int STANDARD_VALUE_ARRAY = 5;
    private static Lectures[] lectureArray;
    private static int newCapacity;
    public static Lectures[] increaseArray;


    public LecturesRepository() {

        this.lectureArray = new Lectures[STANDARD_VALUE_ARRAY];
    }

    @Override
    public String toString() {
        return "LecturesRepository{}";
    }


    public static void addLecture(Lectures o) {
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

    public static void increaseCapacity() {
        newCapacity = (STANDARD_VALUE_ARRAY * 3) / 2 + 1;
        increaseArray = new Lectures[newCapacity];

        System.arraycopy(lectureArray, 0, increaseArray, 0, 8);

        lectureArray = increaseArray;

    }

    public static void newArray(Lectures o) {
        for (int i = 0; i < increaseArray.length; i++) {
            if (increaseArray[i] == null) {
                increaseArray[i] = o;
                break;
            }
        }
    }

    public static Lectures[] getLectureArray() {
        return lectureArray;
    }

    public static Lectures[] getIncreaseArray() {
        return increaseArray;
    }

    public static int getNewCapacity() {
        return newCapacity;
    }

    public static void setNewCapacity(int newCapacity) {
        LecturesRepository.newCapacity = newCapacity;
    }
}