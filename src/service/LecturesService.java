package service;

import models.Lectures;

import static repository.LecturesRepository.increaseArray;

public class LecturesService {

    public static void showElements() {
        for (Lectures lectures : increaseArray) {
            System.out.println(lectures.getID());
        }
    }
}
