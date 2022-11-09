import models.Course;
import models.Lectures;

public class Main {
    public static void main(String[] args) {
//        Lectures lectures = new Lectures();
//        Lectures secondLectures = new Lectures();
//        Lectures thirdLectures = new Lectures();
//
//        System.out.println(Lectures.counter);
//        Lectures fourthLectures = new Lectures();
//        Lectures fifthLectures = new Lectures();


        Course course = new Course();
        Lectures lectures = new Lectures(course.getID());
        Lectures firstLectures = new Lectures(course.getID());
        Lectures secondLectures = new Lectures(course.getID());
        Lectures thirdLectures = new Lectures(course.getID());
        Lectures fourthLectures = new Lectures(course.getID());
        Lectures fifthLectures = new Lectures(course.getID());
        Lectures sixthLectures = new Lectures(course.getID());

        System.out.println(sixthLectures.courseID);
        System.out.println(Lectures.counter);

    }
}