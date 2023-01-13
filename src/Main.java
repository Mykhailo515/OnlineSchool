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

        Lectures firstLecture = new Lectures(1, "First",3);

        LecturesRepository.addLecture(firstLecture);
        System.out.println(Arrays.toString(LecturesRepository.getLectureArray()));

        LecturesRepository.increaseCapacity();
        System.out.println(LecturesRepository.getNewArray());
        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));

        CourseRepository.addCourse(new Course("First"));
        LecturesRepository.addNewLecture(new Lectures(2, "Second", 4));
        LecturesRepository.addNewLecture(new Lectures(3, "Third", 5));
        LecturesRepository.addNewLecture(new Lectures(4, "Fourth", 6));
        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));

      //  LecturesService.ShowElements();

    }



}