import models.*;
import repository.CourseRepository;
import repository.LecturesRepository;
import service.LecturesService;
import service.MainService;

import java.util.Arrays;

import static repository.LecturesRepository.*;

public class Main {
    public static void main(String[] args) {

//        int category = MainService.optionCategory(MainService.firstChoice());
//        MainService.secondChoice(); MainService.firstChoice();
//        MainService.showArray(MainService.ObjectArray());


        LecturesRepository lecturesRepository = new LecturesRepository();
        CourseRepository courseRepository = new CourseRepository();

        Lectures firstLecture = new Lectures(1, "First", 3);

        LecturesRepository.increaseCapacity();
        addLecture(firstLecture);
        System.out.println(Arrays.toString(LecturesRepository.getLectureArray()));

        System.out.println(LecturesRepository.getNewCapacity());
        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));

        CourseRepository.addCourse(new Course("First"));
        LecturesRepository.addLecture(new Lectures(2, "Second", 4));
        LecturesRepository.addLecture(new Lectures(3, "Third", 5));
        LecturesRepository.addLecture(new Lectures(4, "Fourth", 25));

        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));

        LecturesService.showElements();

    }
}