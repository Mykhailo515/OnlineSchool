import models.*;
import repository.CourseRepository;
import repository.LecturesRepository;
import repository.SuperRepository;
import service.LectureService;
import service.PersonService;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static repository.LecturesRepository.*;

public class Main {
    public static void main(String[] args) {

//        int category = MainService.optionCategory(MainService.firstChoice());
//        MainService.secondChoice(); MainService.firstChoice();
//        MainService.showArray(MainService.ObjectArray());


        LecturesRepository lecturesRepository = new LecturesRepository();
        CourseRepository courseRepository = new CourseRepository();

        Lecture firstLecture = new Lecture(1, 1, 1, "first", "full");

        LecturesRepository.increaseCapacity();
        addLecture(firstLecture);
        System.out.println(Arrays.toString(LecturesRepository.getLectureArray()));

        System.out.println(LecturesRepository.getNewCapacity());
        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));

        LecturesRepository.addLecture(new Lecture(2, 2, 2, "second", "full"));
        LecturesRepository.addLecture(new Lecture(3, 3, 3, "third", "full"));
        LecturesRepository.addLecture(new Lecture(4, 4, 4, "fourth", "full"));

        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));

        //    LectureService.showElements();


        SuperRepository superRepository = new SuperRepository();
        superRepository.add(new Lecture(5, 5, 5, "fifth", "full"));

        Person firstTeacher = new Person(1, 2, Role.TEACHER, "lastname", "firstname",
                "phone", "email");
        System.out.println(firstTeacher);

        LectureService.сreateTeacher();
        System.out.println();

    //    PersonService.checkDate();

    }


}