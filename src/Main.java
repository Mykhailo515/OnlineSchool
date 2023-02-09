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

        System.out.println(Arrays.toString(LectureRepository.getLectureArray()));

        objectLecture.addLecture(new Lecture(2, 2, 2, "second", "full"));

        genericRepository.add(new Lecture(1,1,1,"first","full"));
        genericRepository.add(new Lecture(2,2,2,"second","full"));
        genericRepository.add(new Lecture(3,3,3,"third","third"));

        System.out.println(Arrays.toString(LectureRepository.getIncreaseArray()));
        System.out.println(Arrays.toString(GenericRepository.getIncreaseArray()));



    }


}