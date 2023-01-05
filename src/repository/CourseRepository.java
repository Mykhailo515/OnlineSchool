package repository;

import models.Course;

import java.util.Arrays;

public class CourseRepository {
    private static Course[] courseArray;
    private static final int STANDARD_VALUE_ARRAY = 5;


    public CourseRepository() {
        this.courseArray = new Course[STANDARD_VALUE_ARRAY];
    }

    @Override
    public String toString() {
        return "CourseRepository{" +
                "courseArray=" + Arrays.toString(courseArray) +
                '}';
    }
    public static void addCourse(Course o){
        for (int i = 0; i < courseArray.length; i++) {
            if (courseArray[i] == null){
                courseArray[i] = o;
                break;
            }
        }
    }

    public static Course[] getCourseArray() {
        return courseArray;
    }
}
