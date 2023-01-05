import models.*;
import repository.CourseRepository;
import repository.LecturesRepository;
import service.LecturesService;
import service.MainService;

import java.util.Arrays;

import static repository.LecturesRepository.*;

public class Main {
    public static void main(String[] args) {


        int category = MainService.optionCategory(MainService.firstChoice());
        MainService.secondChoice(); MainService.firstChoice();
        MainService.showArray(MainService.ObjectArray());


        LecturesRepository lecturesRepository = new LecturesRepository();
        CourseRepository courseRepository = new CourseRepository();

        Lectures firstLecture = new Lectures("first", "Full", 1);

        LecturesRepository.addLecture(firstLecture);
        System.out.println(Arrays.toString(LecturesRepository.getLectureArray()));

        LecturesRepository.increaseCapacity();
        System.out.println(LecturesRepository.getNewArray());
        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));

        CourseRepository.addCourse(new Course("First"));
        LecturesRepository.addNewLecture(new Lectures("First", "Full", 11));
        LecturesRepository.addNewLecture(new Lectures("Second", "Full", 22));
        LecturesRepository.addNewLecture(new Lectures("Third", "Full", 35));
        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));

        LecturesService.ShowElements();

    }



}