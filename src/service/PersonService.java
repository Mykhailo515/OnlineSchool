package service;

import models.Person;
import models.Role;

import static models.Role.TEACHER;

public class PersonService {
    public static Person creatTeacher(int ID, int courseID, Role role){
        Person teacher = new Person(ID, courseID, TEACHER);
        return teacher;
    }
    public static Person createLimitTeacher(int id) {
        return new Person(id);
    }
}
