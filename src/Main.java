import models.*;
import repository.CourseRepository;
import repository.LectureRepository;
import repository.SuperRepository;
import service.LectureService;

import java.util.Arrays;

import static repository.LectureRepository.*;

public class Main {
    public static void main(String[] args) {

        LectureRepository objectLecture = new LectureRepository();

        System.out.println(Arrays.toString(LectureRepository.getLectureArray()));

        System.out.println(Arrays.toString(getIncreaseArray()));
        System.out.println(Arrays.toString(LectureRepository.getIncreaseArray()));

        LectureRepository.addLecture(new Lecture(2, 2, 2, "second", "full"));
        objectLecture.add(new Lecture(3, 3, 3, "third", "full"));
        objectLecture.add(new Lecture(4, 4, 4, "fourth", "full"));

        System.out.println(Arrays.toString(LectureRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));


//        SuperRepository superRepository = new SuperRepository();
//        superRepository.add(new Lecture(5, 5, 5, "fifth", "full"));
//
//        Person firstTeacher = new Person(1, 2, Role.TEACHER, "lastname", "firstname",
//                "phone", "email");
//        System.out.println(firstTeacher);
//
//        LectureService.createTeacher();
//        System.out.println();


    }


}