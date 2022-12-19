import models.*;
import service.MainService;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(11);
        Lectures firstLecture = new Lectures("first", 1);
        Lectures secondLectures = new Lectures("second", 2);
        Lectures thirdLectures = new Lectures("third", 3);
        Lectures fourthLectures = new Lectures("fourth", 4);
        Lectures fifthLectures = new Lectures("fifth", 5);
        Lectures sixthLectures = new Lectures("sixth", 6);

        int category = MainService.optionCategory(MainService.firstChoice());
        MainService.secondChoice();
    }
}