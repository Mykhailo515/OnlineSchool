package service;

import models.Lecture;
import models.Person;
import repository.PersonRepository;

import java.util.Scanner;

import static repository.LecturesRepository.increaseArray;




public class LectureService {


    private final static PersonRepository REPOSITORY_PERSON
            = new PersonRepository();

    public static void showElements() {
        for (Lecture lecture : increaseArray) {
            System.out.println(lecture.getId());
        }
    }
    static Scanner scanner = new Scanner(System.in);
    public static void сreateTeacher() {
        System.out.println("Create teacher?");
        System.out.println("1 Yes");
        System.out.println("1 No");
        int choice = scanner.nextInt();
        readTeacher(choice);
    }

    private static void readTeacher(int choice) {
        switch (choice) {
            case 0:

                break;
            case 1:
                System.out.println("Enter id teacher");
                int teacherId = scanner.nextInt();
                Person teacher = PersonService.createLimitTeacher(teacherId);
                REPOSITORY_PERSON.add(teacher);
                break;
        }
    }
}
