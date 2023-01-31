package service;

import models.Person;
import models.Role;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static models.Role.TEACHER;

public class PersonService {
    public static Person creatTeacher(int id, int courseId, Role role, String lastname,
                                      String firstname, String phone, String email) {
        Person teacher = new Person(id, courseId, TEACHER, lastname, firstname, phone, email);
        return teacher;
    }

    public static Person createLimitTeacher(int id) {
        return new Person(id);
    }

    public static void checkDate() {
        Scanner scanner = new Scanner(System.in);
        String regexName = "^[a-zA-Z]+$";// Jordan
        String regexPhone = "^\\W\\d{4}\\-\\d{3}\\-\\d{2}\\-\\d{2}$";// +1268-999-01-75
        String regexEmail = "^\\w+\\.\\w+.\\w+\\.\\w+$";// jordan.air@com.usa
//        Pattern patternName = Pattern.compile(regexName);
//        Pattern patternName = Pattern.compile(regexPhone);
        Pattern patternName = Pattern.compile(regexEmail);
//        System.out.println("Enter your name!");
//        System.out.println("Enter your phone!");
        System.out.println("Enter your email!");
        String found = scanner.nextLine();
        Matcher matcher = patternName.matcher(found);
        boolean b = matcher.matches();
        System.out.println(b);
        scanner.close();
    }
     // Метод checkDat, як приклад перевірки.


}
