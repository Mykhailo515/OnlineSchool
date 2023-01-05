package service;

import models.Lectures;

import static repository.LecturesRepository.increaseArray;

public class LecturesService {

    public static void ShowElements() {
        for (Lectures lectures : increaseArray) {
            System.out.println(lectures.getCourseID());
        }
    }
}
