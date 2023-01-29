import models.*;
import repository.CourseRepository;
import repository.LecturesRepository;
import repository.SuperRepository;

import java.util.Arrays;

import static repository.LecturesRepository.*;

public class Main {
    public static void main(String[] args) {

//        int category = MainService.optionCategory(MainService.firstChoice());
//        MainService.secondChoice(); MainService.firstChoice();
//        MainService.showArray(MainService.ObjectArray());


        LecturesRepository lecturesRepository = new LecturesRepository();
        CourseRepository courseRepository = new CourseRepository();

        Lecture firstLecture = new Lecture(1, 1,1);

        LecturesRepository.increaseCapacity();
        addLecture(firstLecture);
        System.out.println(Arrays.toString(LecturesRepository.getLectureArray()));

        System.out.println(LecturesRepository.getNewCapacity());
        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));

        LecturesRepository.addLecture(new Lecture(2,2,2));
        LecturesRepository.addLecture(new Lecture(3, 3,3));
        LecturesRepository.addLecture(new Lecture(4, 4,4));

        System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));

  //      LecturesService.showElements();


        SuperRepository superRepository = new SuperRepository();
        superRepository.add(new Lecture(5,5,5));

        Person firstTeacher = new Person(1,2,Role.TEACHER);
        System.out.println(firstTeacher);

    }

}