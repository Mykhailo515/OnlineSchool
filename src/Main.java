import models.*;
import repository.CourseRepository;
import repository.LectureRepository;
import repository.SuperRepository;
import service.LectureService;

import java.util.Arrays;

import static repository.LectureRepository.*;

public class Main {
    public static void main(String[] args) {

        LectureRepository lecturesRepository = new LectureRepository();
        CourseRepository courseRepository = new CourseRepository();

        Lecture firstLecture = new Lecture(1, 1, 1, "first", "full");

        LectureRepository.increaseCapacity();
        addLecture(firstLecture);
        System.out.println(Arrays.toString(LectureRepository.getLectureArray()));

        System.out.println(LectureRepository.getNewCapacity());
        System.out.println(Arrays.toString(LectureRepository.getIncreaseArray()));

        LectureRepository.addLecture(new Lecture(2, 2, 2, "second", "full"));
        LectureRepository.addLecture(new Lecture(3, 3, 3, "third", "full"));
        LectureRepository.addLecture(new Lecture(4, 4, 4, "fourth", "full"));

        System.out.println(Arrays.toString(LectureRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(CourseRepository.getCourseArray()));


        SuperRepository superRepository = new SuperRepository();
        superRepository.add(new Lecture(5, 5, 5, "fifth", "full"));

        Person firstTeacher = new Person(1, 2, Role.TEACHER, "lastname", "firstname",
                "phone", "email");
        System.out.println(firstTeacher);

        LectureService.сreateTeacher();
        System.out.println();

    }


}