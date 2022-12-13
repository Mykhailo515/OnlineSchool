import models.Course;
import models.HomeWork;
import models.Lectures;
import models.Teachers;
import service.MainService;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(2);
        Lectures firstLecture = new Lectures("first", course.getID());
        Lectures secondLectures = new Lectures("second", course.getID());
        Lectures thirdLectures = new Lectures("third", course.getID());
        Lectures fourthLectures = new Lectures("fourth", course.getID());
        Lectures fifthLectures = new Lectures("fifth", course.getID());
        Lectures sixthLectures = new Lectures("sixth", course.getID());

        int category = MainService.optionCategory(MainService.firstOption());
        MainService.secondOption();
    }


}