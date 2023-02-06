import models.*;
import repository.CourseRepository;
import repository.GenericRepository;
import repository.LectureRepository;
import repository.SuperRepository;
import service.LectureService;

import java.util.Arrays;

import static repository.LectureRepository.*;

public class Main {
    public static void main(String[] args) {

        LectureRepository objectLecture = new LectureRepository();
        GenericRepository genericRepository = new GenericRepository();

        objectLecture.add(new Lecture(2, 2, 2, "second", "full"));
        objectLecture.add(new Lecture(3, 3, 3, "third", "full"));
        objectLecture.add(new Lecture(4, 4, 4, "fourth", "full"));

        genericRepository.add(new Lecture(1, 1, 1, "first", "full"));
        genericRepository.add(new Lecture(2, 2, 2, "second", "full"));
        genericRepository.add(new Lecture(3, 3, 3, "third", "full"));

        System.out.println(Arrays.toString(LectureRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));
        LectureRepository.addLecture();


        SuperRepository superRepository = new SuperRepository();
        superRepository.add(new Lecture(5, 5, 5, "fifth", "full"));

        Person firstTeacher = new Person(1, 2, Role.TEACHER, "lastname", "firstname",
                "phone", "email");
        System.out.println(firstTeacher);

        LectureService.сreateTeacher();
        System.out.println();


    }


}