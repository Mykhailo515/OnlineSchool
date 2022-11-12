import models.Course;
import models.Lectures;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(2);
        Lectures lectures = new Lectures(course.getID());
        Lectures firstLectures = new Lectures(course.getID());
        Lectures secondLectures = new Lectures(course.getID());
        Lectures thirdLectures = new Lectures(course.getID());
        Lectures fourthLectures = new Lectures(course.getID());
        Lectures fifthLectures = new Lectures(course.getID());

        System.out.println(fifthLectures.courseID);
        System.out.println(Lectures.counter);

    }
}