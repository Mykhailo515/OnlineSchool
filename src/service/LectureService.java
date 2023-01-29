package service;

import models.Lecture;

import static repository.LecturesRepository.increaseArray;

public class LectureService {

    public static void showElements() {
        for (Lecture lectures : increaseArray) {
            System.out.println(lectures.getID());
        }
    }
}
