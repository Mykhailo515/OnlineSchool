package repository;

import models.Lectures;

public class LecturesRepository {

    private final int STANDART_INIT_CAPACITY = 4;
    private Lectures[] lecturesArray;

    public LecturesRepository(Lectures[] lecturesArray) {
        this.lecturesArray = new Lectures[STANDART_INIT_CAPACITY];
    }

    public LecturesRepository(int inputCapacity) {
        if (inputCapacity < 1) {
            System.out.println("Wrong argment, creating standart capacity array");
            this.lecturesArray = new Lectures[STANDART_INIT_CAPACITY];
        } else {
            this.lecturesArray = new Lectures[inputCapacity];
        }
    }
}
