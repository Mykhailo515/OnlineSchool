package service;

import models.Lectures;
import repository.LecturesRepository;

import java.util.Arrays;
import java.util.Scanner;

public class MainService {

    static Scanner scanner = new Scanner(System.in);


    public static int firstChoice() {
        System.out.println("Menu:");
        System.out.println("1. Course");
        System.out.println("2. Teachers");
        System.out.println("3. Students");
        System.out.println("4. Lectures");
        return scanner.nextInt();
    }

    public static int secondChoice() {
        System.out.println("Select category");
        System.out.println("1. Menu");
        System.out.println("2. Exit");
        int put = scanner.nextInt();
        if (put == 1) {
            return firstChoice();
        } else if (put == 2) {
            System.out.println("Exit the program!");
            return 0;
        } else {
            System.out.println("Error");
            return optionCategory(0);
        }
    }

    public static int optionCategory(int insert) {
        return switch (insert) {
            case 1:
                System.out.println("Course");
                yield 1;
            case 2:
                System.out.println("Teachers");
                yield 2;
            case 3:
                System.out.println("Students");
                yield 3;
            case 4:

                System.out.println("Enter lecture name:");
                scanner.next();
                Lectures lecture = new Lectures("Education", "Full", 2);
                System.out.println(lecture);
                System.out.println("Total number of lectures = " + Lectures.counter);
                System.out.println("--------------------------------------");


                yield 4;
            default:
                System.out.println("Create another lecture?");
                System.out.println("1 - Yes");
                System.out.println("2 - Exit");
                int input = scanner.nextInt();
                if (input == 1) {
                    yield whileDo();
                } else if (input == 2) {
                    System.out.println("Exit the program!");
                    yield 2;
                } else {
                    System.out.println("Error");
                    yield optionCategory(0);
                }
        };
    }

    public static int whileDo() {
        int i = 1;
        while (i < 10) {
            System.out.println("Lecture number:" + i);

            if (i == 9) {
                System.out.println("Exit");
                break;
            }
        }
        return i;
    }

    public static int inputArray() {
        System.out.println("Show all objects from the array?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        scanner.nextInt();
        return 0;
    }

    public static int showArray(int takeArray) {
        return switch (takeArray) {
            case 1:
                System.out.println(Arrays.toString(LecturesRepository.getIncreaseArray()));
                yield 1;
            case 2:
                yield 2;
            default:
                throw new IllegalStateException("Unexpected value: " + takeArray);
        };
    }
}





