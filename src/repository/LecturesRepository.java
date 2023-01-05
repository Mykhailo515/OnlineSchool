package repository;

import models.Course;
import models.Lectures;

public class LecturesRepository {

    private static final int STANDARD_VALUE_ARRAY = 5;
    private static Lectures[] lectureArray;
    private static int newArray;
    private static Lectures[] increaseArray;


    public LecturesRepository() {

        this.lectureArray = new Lectures[STANDARD_VALUE_ARRAY];
    }

    @Override
    public String toString() {
        return "LecturesRepository{}";
    }

    public static void addLecture(Lectures o) {
        for (int i = 0; i < lectureArray.length; i++) {
            if (lectureArray[i] == null) {
                lectureArray[i] = o;
                break;
            }
        }
    }

    public static void increaseCapacity() {
        newArray = (STANDARD_VALUE_ARRAY * 3) / 2 + 1;
        increaseArray = new Lectures[newArray];
    }

    public static Lectures[] getLectureArray() {
        return lectureArray;
    }

    public static void addNewLecture(Lectures o) {
        for (int i = 0; i < increaseArray.length; i++) {
            if (increaseArray[i] == null) {
                increaseArray[i] = o;
                break;
            }
        }
    }

    public static int getNewArray() {
        return newArray;
    }

    public static Lectures[] getIncreaseArray() {
        return increaseArray;
    }
}